

# num = 19
#
# for i in range(1, 19):
#    print(num, 'x', i, '=', num*i)
#--------------------------------------------------------------------------------------

import re
def isValid(s):

    Pattern = re.compile("(0/91)?[7-9][0-9]{9}")
    return Pattern.match(s)

s = "9660534062089"
if (isValid(s)):
    print("Valid Number")
else:
    print("Invalid Number")





