import math


## Math module

print("Math module printing the pi value = {}".format(math.pi))

## RegEx

import re as regex

pattern = "^[hH]....m$"
test_string_cap = "Hisham"
test_string_small = "hisham"
result = regex.match(pattern, test_string_small)
result2 = regex.match(pattern, test_string_cap)


testing_saudi_number = "+966567057050"
number_pattern = "^[+966]+\d{9}$"
result3 = regex.match(number_pattern, testing_saudi_number)


## letters matching
if result and result2:
    print("Match")
else:
    print("No Match")

## numbers matching
if result3:
    print("Match Saudi Number")
else:
    print("No Match")


foo = 'abc' * 10

print(foo)