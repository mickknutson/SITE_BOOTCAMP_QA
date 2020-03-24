import re as regex

pattern = '^(966)(5|05)[0-9]{8}'
test_string = ( input ( "Enter a number: " ) )

result = regex.match(pattern, test_string)
if result:
    print("Saudi Number.")
else:
    print(" Not Saudi Number.")
