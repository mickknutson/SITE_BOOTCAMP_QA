import re as regex

pattern = '^(966)(5|05)[0-9]{8}'
test_string = '966534890579'

result = regex.match(pattern, test_string)
if result:
    print("Search successful.")
else:
    print("Search unsuccessful.")
