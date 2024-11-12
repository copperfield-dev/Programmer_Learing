cars = ['bmw', 'audi', 'toyota', 'subaru'] 

print("Here is the original list:")   
print(cars)  
print("\nHere is the sorted list:")   
print(sorted(cars))  
print("\nHere is the original list again:")   
print(cars)

for car in cars:
  if car == 'bmw':           
    print(car.upper())
  else:           
    print(car.title())