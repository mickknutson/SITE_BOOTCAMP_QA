import re as regex

num = "966502379225"

pattern = regex.compile(r"^(966?(-?\d{10})$)")
matches = pattern.findall(num)

if len(matches) > 0:
    print("It is Saudi number")
else:
    print("Not Saudi number")