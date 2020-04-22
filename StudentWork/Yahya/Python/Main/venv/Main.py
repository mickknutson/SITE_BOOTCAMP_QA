

# num = 19
#
# for i in range(1, 19):
#    print(num, 'x', i, '=', num*i)
#--------------------------------------------------------------------------------------

# import re
# def isValid(s):
#
#     Pattern = re.compile("(0/91)?[7-9][0-9]{9}")
#     return Pattern.match(s)
#
# s = "9660534062089"
# if (isValid(s)):
#     print("Valid Number")
# else:
#     print("Invalid Number")



# a = int(input("Enter Your 1st Number : "))
# b = int(input("Enter Your 2st Number : "))
# z = a + b
#
# print(" a + b = " + z)




# ---------------------------------------IF----------------------------------------

# a = int(input("Enter Your 1st Number : "))
# b = int(input("Enter Your 2st Number : "))
# c = int(input("Enter Your 1st Number : "))
#
#
# if a > b and  a > c:
#     print("the Greater No. is " , a)
# elif  (b > a and  b > c):
#     print(b)
# elif  (c > a and  c > b):
#     print(c)
#
# else:
#     print("Wrong Entry")

# --------------------------------------While Loop------------------------------------------------------

# i  = 1
#
# while i <= 4:
#     print('#' , end= " ")
#
#     i= i+1
#
#     j = 1
#
#     while j <= 4:
#         print('#', end=" ")
#
#         j = i + 1
i = 4
for i in range (4):

    for o in range(1):
        print("#")
        o = o +1

    for p in range(2):
            print("#",end=" ")
            p = p + 1

    for j in range(3):
                print("#",end=" ")
                j = j + 1

    for x in range(4):
                    print("#",end=" ")
                    x = x +1
print()






