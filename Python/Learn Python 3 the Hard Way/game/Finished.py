from Scene import Scene

class Finished(Scene):

    def enter(self):
        print("You won! Good job.") 
        return 'finished'