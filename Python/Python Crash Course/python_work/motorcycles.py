motorcycles = ['honda', 'yamaha', 'suzuki'] 
print(motorcycles)  

motorcycles[0] = 'ducati' 
print(motorcycles)

motorcycles.append('ducati')
print(motorcycles)

del motorcycles[0]
print(motorcycles)

popped_motorcycle = motorcycles.pop()
print(motorcycles) 
print(popped_motorcycle)

motorcycles.remove('suzuki')
print(motorcycles)