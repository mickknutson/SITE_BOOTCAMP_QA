import re as regex
pattern = '^a...s$'
num = input("Enter your number: ")
result = regex.findall(r"\+\b966", num)
if result:
  print("correct number.")
else:
    print("incorrect number.")