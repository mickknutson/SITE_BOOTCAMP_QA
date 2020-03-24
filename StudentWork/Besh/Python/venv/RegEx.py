import re as regex
pattern = '^[Bb]..h$'
test_string1 = 'Besh'
test_string2 = 'besh'
result1 = regex.match(pattern, test_string1)
result2 = regex.match(pattern, test_string2)
if result1 and result2:
    print('Search Successful')
else:
    print("Search Unsuccessful")

number_pattern = '^[+966]+[0-9]{9}'
test_number = '+966555090234'

result3 = regex.match(number_pattern, test_number)
if result3:
    print("Successful")
else:
    print("Unsuccessful")