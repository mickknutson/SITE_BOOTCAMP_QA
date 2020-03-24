import re as regex

pattern = '^a...s$'
test_string = 'abyss'
result = regex.match(pattern, test_string)
if result:
    print("Search successful.")
else:
    print("Search unsuccessful.")


phoneNumber = "+966530104068"
phonePattern ="^[+966]+5[0-9]{8}"
numResult= regex.match(phonePattern, phoneNumber)

if numResult:
    print("Valid")
else:
    print("Invalid")