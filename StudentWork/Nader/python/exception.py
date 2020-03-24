chars = "Nader Althubaity"
size = len(chars)
try:
    if chars.count("N") > 0:
        index = chars.index("N")
        print("the index of the char 'N' is: ",
              index, "and will try the division next")
        print(size/index)
except ZeroDivisionError as exception:
    print(exception, " is not allowed, unless you wanna make up your own math")
print("This String to prove the code is continuing execution")
