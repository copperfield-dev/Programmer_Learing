# 存储顾客所点比萨的信息   
pizza = {       
    'crust': 'thick',       
    'toppings': ['mushrooms', 'extra cheese'],       
}

# 概述顾客点的比萨 
print(f"You ordered a {pizza['crust']}-crust pizza "       
    "with the following toppings:") 

for topping in pizza['toppings']:      
    print(f"\t{topping}")

def make_pizza(size, *toppings):     
    """概述要制作的比萨"""     
    print(f"\nMaking a {size}-inch pizza with the following toppings:")     
    for topping in toppings:         
        print(f"- {topping}")  
    
make_pizza(16, 'pepperoni')
make_pizza(12, 'mushrooms', 'green peppers', 'extra cheese')