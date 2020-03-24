import math


## Math module

print("Math module printing the pi value = {}".format(math.pi))

## RegEx

import re

pattern = "^[hH]....m$"
test_string_cap = "Hisham"
test_string_small = "hisham"
result = re.match(pattern,test_string_small)
result2 = re.match(pattern,test_string_cap)


if result and result2:
    print("Match")
else:
    print("No Match")