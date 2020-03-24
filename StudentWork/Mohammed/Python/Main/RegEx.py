import re
pattern = "^a...s$"
test_string = "abyss"

result =re.match(pattern,test_string)

if result :
    print("Search succussful")
else :
    print("unsuccful!")