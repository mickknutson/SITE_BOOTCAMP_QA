def evenOdd( x ):
    if (x % 2 == 0):
        print("even")
    else:
        print("odd")

evenOdd(2)

evenOdd(3)

# String Lab

name = "Sadeem Alharbi"
print(name)
print(name[7:14])

# Multiplication table of 19

num = 19

for i in range(1, 11):
    print(num, '*', i, '=', num*i)

# Homework, except when number div by zero

try:
    print(10/0)
except:
    print("An exception occurred, Can't divided by zero")
