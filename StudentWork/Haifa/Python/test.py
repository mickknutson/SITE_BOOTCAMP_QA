def isValid(s):

    Pattern = re.compile("(+966)?[7-9][0-9]{9}")
    return Pattern.match(s)



#Driver Code
s="966552488187"
is (isValid(s)):
print("Valid Number")
else:
print("Invalid Number")