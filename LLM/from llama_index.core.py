from llama_index.core.workflow import (
    StartEvent,
    StopEvent,
    Workflow,
    step,
    Event,
)
from llama_index.utils.workflow import draw_all_possible_flows

class FirstEvent(Event):
    first_output: str

class SecondEvent(Event):
    second_output: str

class MyWorkflow(Workflow):
    @step
    async def step1(self, ev: StartEvent) -> FirstEvent:
        print(ev.first_input)
        return FirstEvent(first_output="First step complete.")
    
    @step
    async def step2(self, ev: FirstEvent) -> SecondEvent:
        print(ev.first_output)
        return SecondEvent(second_output="Second step complete.")
    
    @step
    async def step3(self, ev: SecondEvent) -> StopEvent:
        print(ev.second_output)
        return StopEvent(result="Workflow complete.")


async def main():
    w = MyWorkflow(timeout=10, verbose=True)
    result = await w.run(first_input="Hello, World!")
    print(result)
    draw_all_possible_flows(w, filename="multi_step_workflow.html")  # Visualize the workflow


if __name__ == "__main__":
    import asyncio

    asyncio.run(main())
