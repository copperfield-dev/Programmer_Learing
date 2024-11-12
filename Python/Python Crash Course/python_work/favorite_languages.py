favorite_languages = {     
  'jen': 'python',     
  'sarah': 'c',     
  'edward': 'rust',     
  'phil': 'python',
}

language = favorite_languages['sarah'].title()   
print(f"Sarah's favorite language is {language}.")

for name, language in favorite_languages.items():     
  print(f"{name.title()}'s favorite language is {language.title()}.")

for name in sorted(favorite_languages.keys()):     
  print(f"{name.title()}, thank you for taking the poll.")

print("The following languages have been mentioned:") 
for language in set(favorite_languages.values()):     
  print(language.title())