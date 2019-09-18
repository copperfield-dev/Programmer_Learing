## Animal is-a object (yes, sort of confusing) look at the extra credit 
class Animal(object):
    
    def show(self):
        print('An animal')

class Dog(Animal):

    def __init__(self, name):
        self.name = name

    def show(self):
        print('A dog')

class Cat(Animal):

    def __init__(self, name):
        self.name = name

    def show(self):
        print('A cat')

class Person(object):

    def __init__(self, name):
        self.name = name
        ## Person has-a pet of some kind 
        self.pet = None
        self.show()

    def show(self):
        print('A person:', self.name)


class Employee(Person):

    def __init__(self, name, salary):
        super(Employee, self).__init__(name)
        self.salary = salary


class Fish(object):
    pass

class Salmon(Fish):
    pass

class Halibut(Fish):
    pass

## rover is-a Dog 
rover = Dog("Rover")
rover.show()

satan = Cat("Satan")
satan.show()

mary = Person("Mary")

mary.pet = satan

frank = Employee("Frank", 120000)

frank.pet = rover

flipper = Fish()

crouse = Salmon()

harry = Halibut()



