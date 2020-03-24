def evenOdd(x):
    if (x % 2 == 0):
        print("even")
    else:
        print("odd")


evenOdd(2)
evenOdd(3)

evenOdd(122)


#------------------------------------------------------
# String lab:

name = "Abdullah Alsrhri"

print(name[9:])

#--------------------------------------------------------
# Loop lab

i = 1;

print()
while (i <= 19):
    print(19 , " x " , i , " = " , i*19)
    i+=1


#----------------------------------------------------------
#  exception handling lab

try:
    print(5/0)
except ZeroDivisionError:
    print()
    print("Exception of type ZeroDivisionError occurred")
finally:
    print("*** inside finally ***")