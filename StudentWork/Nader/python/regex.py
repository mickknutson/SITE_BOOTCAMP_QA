import re as regex

number = "966556632998"

pattern = regex.compile(r"^(966?(-?\d{10})$)")
matches = pattern.findall(number)

if len(matches) > 0:
    print("The number is a valid Saudi number")
