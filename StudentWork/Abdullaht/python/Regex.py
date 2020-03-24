
import re as regex

pattern = "^966"

test_string = "966598739980"

result = regex.match(pattern,test_string)

if result:
    print("Saudi number")
else:
    print("Not Saudi number")