import re as regex

number = "966503317351"

test_number = "^(9665)[0-9]{8}"

result = regex.match(test_number, number)

if (result):
    print("Yes, it is Saudi Number")
else:
    print("No, it is not Saudi Number")
