from Scene import Scene
from textwrap import dedent

class TheBridge(Scene):

    def enter(self):
        print(dedent(""" 
            You burst onto the Bridge with the netron destruct bomb 
            under your arm and surprise 5 Gothons who are trying to 
            take control of the ship. Each of them has an even uglier 
            clown costume than the last. They haven't pulled their 
            weapons out yet, as they see the active bomb under your 
            arm and don't want to set it off.
            """))

        action = input("> ")

        if action == "throw the bomb":
            print(dedent(""" 
                In a panic you throw the bomb at the group of Gothons 
                and make a leap for the door. Right as you drop it a 
                Gothon shoots you right in the back killing you. As
                you die you see another Gothon frantically try to 
                disarm the bomb. You die knowing they will probably 
                blow up when it goes off.   
                """)) 
            return 'death'

        elif action == "slowly place the bomb":
            print(dedent(""" 
                You point your blaster at the bomb under your arm and 
                the Gothons put their hands up and start to sweat. 
                You inch backward to the door, open it, and then 
                carefully place the bomb on the floor, pointing your 
                blaster at it. You then jump back through the door, 
                punch the close button and blast the lock so the 
                Gothons can't get out. Now that the bomb is placed 
                you run to the escape pod to get off this tin can.
                """))

            return 'escape_pod'
        else:
            print("DOES NOT COMPUTE!") 
            return "the_bridge"