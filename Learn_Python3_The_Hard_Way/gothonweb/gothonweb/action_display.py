class Display(object):

    display_map = {}

    def __init__(self, name, description):
        self.name = name
        self.description = description
        Display.display_map[name] = description


shoot_display = Display("shoot!",
    """
    Quick on the draw you yank out your blaster and fire it at the Gothon. 
    His clown costume is flowing and moving around his body, which throws 
    off your aim. Your laser hits his costume but misses him entirely. 
    This completely ruins his brand new costume his mother bought him, 
    which makes him fly into an insane rage and blast you repeatedly 
    in the face until you are dead. Then he eats you.
    """
)

dodge_display = Display("dodge!",
    """
    Like a world class boxer you dodge, weave, slip and slide right as 
    the Gothon's blaster cranks a laser past your head. In the middle of 
    your artful dodge your foot slips and you bang your head on the metal 
    wall and pass out. You wake up shortly after only to die as the Gothon 
    stomps on your head and eats you.
    """
)

tell_a_joke_display = Display("tell a joke",
    """
    Lucky for you they made you learn Gothon insults in 
    the academy. You tell the one Gothon joke you know: 
    Lbhe zbgure vf fb sng, jura fur fvgf nebhaq gur ubhfr, 
    fur fvgf nebhaq gur ubhfr. The Gothon stops, tries 
    not to laugh, then busts out laughing and can't move. 
    While he's laughing you run up and shoot him square in 
    the head putting him down, then jump through the 
    Weapon Armory door.
    """
)


guess_correct_display = Display("guess correct",
    """ 
    The container clicks open and the seal breaks, letting 
    gas out. You grab the neutron bomb and run as fast as 
    you can to the bridge where you must place it in the 
    right spot.
    """
)


guess_error_display = Display("guess error",
    """ 
    The lock buzzes one last time and then you hear a 
    sickening melting sound as the mechanism is fused 
    together. You decide to sit there, and finally the 
    Gothons blow up the ship from their ship and you die. 
    """
)


throw_the_bomb_display = Display("throw the bomb",
    """
    In a panic you throw the bomb at the group of Gothons 
    and make a leap for the door. Right as you drop it a 
    Gothon shoots you right in the back killing you. As
    you die you see another Gothon frantically try to 
    disarm the bomb. You die knowing they will probably 
    blow up when it goes off.
    """
)

slowly_place_the_bomb_display = Display("slowly place the bomb",
    """
    You point your blaster at the bomb under your arm and 
    the Gothons put their hands up and start to sweat. 
    You inch backward to the door, open it, and then 
    carefully place the bomb on the floor, pointing your 
    blaster at it. You then jump back through the door, 
    punch the close button and blast the lock so the 
    Gothons can't get out. Now that the bomb is placed 
    you run to the escape pod to get off this tin can.
    """
)

def load_display(action):
    return Display.display_map.get(action, None)