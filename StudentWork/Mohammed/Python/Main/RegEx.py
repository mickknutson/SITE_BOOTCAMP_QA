# pattern = "^a...s$"
# test_string = "abyss"
#
# result =re.match(pattern,test_string)
#
# if result :
#     print("Search succussful")
# else :
#     print("unsuccful!")

# Write a program to check the number is from india or not make use of the
# number whcih will remain as a prefix number to all indina number

import re as regex

pattern = "^966"
pattern2 = "^(966)(5|05)[0-9]{8}"
test_string ="966551166749"

result = regex.match(pattern2,test_string)

if result:
    print("Number is form Saudi")
else:
    print("Number is not form Saudi")
