
# Import the RegEx Module:
import re

#     [] . ^ $ * + ? {} () \ |
pattern = '^[Aa]...s$'

test_string = 'Abyss'

# Use the RE module to try to match a String with a pattern:
result = re.match(pattern, test_string)

if result:
  print("Search successful!!! :-D")
else:
  print("Search unsuccessful. :-(")
