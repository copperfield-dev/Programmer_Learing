public class WideCardDemo3 {
  public static void main(String[] args) {
    GenericStack<String> stack1 = new GenericStack<String>();
    GenericStack<Object> stack2 = new GenericStack<Object>();
    stack2.push("Java");
    stack2.push(2);
    stack1.push("Sun");
    add(stack1, stack2);
    WideCardDemo2.print(stack2);
  }

  public static <T> void add(GenericStack<T> stack1,
    GenericStack<? super T> stack2) {
    while (!stack1.isEmpty()) {
      stack2.push(stack1.pop());
    }
  }
}