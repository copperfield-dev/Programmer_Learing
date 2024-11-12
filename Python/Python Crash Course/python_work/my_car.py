from car import Car, ElectricCar

my_new_car = Car('audi', 'a4', 2024)   
print(my_new_car.get_descriptive_name())
my_new_car.update_odometer(25)
my_new_car.update_odometer(20)
my_new_car.read_odometer()

my_used_car = Car('subaru', 'outback', 2019)   
print(my_used_car.get_descriptive_name())  
my_used_car.update_odometer(23_500)   
my_used_car.read_odometer()  
my_used_car.increment_odometer(100)
my_used_car.read_odometer()

my_mustang = Car('ford', 'mustang', 2024)   
print(my_mustang.get_descriptive_name()) 
my_leaf = ElectricCar('nissan', 'leaf', 2024)   
print(my_leaf.get_descriptive_name())