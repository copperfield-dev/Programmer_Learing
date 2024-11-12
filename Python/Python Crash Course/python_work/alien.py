alien_0 = {'color': 'green', 'points': 5}  

print(alien_0['color']) 
print(alien_0['points'])

alien_0['x_position'] = 0 
alien_0['y_position'] = 25 

print(alien_0)

new_points = alien_0['points'] 
print(f"You just earned {new_points} points!")

alien_0['color'] = 'yellow' 
print(f"The alien is now {alien_0['color']}.")

del alien_0['points']   
print(alien_0)

print()
alien_0 = {'color': 'green', 'points': 5}   
alien_1 = {'color': 'yellow', 'points': 10}   
alien_2 = {'color': 'red', 'points': 15}  
aliens = [alien_0, alien_1, alien_2]    
for alien in aliens:       
  print(alien)