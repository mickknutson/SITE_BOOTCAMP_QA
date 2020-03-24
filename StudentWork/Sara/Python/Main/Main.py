print("Hello World")


def evenOdd(x):
    if x % 2 == 0:

        print("even")

    else:

        print("odd")


evenOdd(2)

evenOdd(3)

myName = "Sara Alhunaiti"
print(myName[5:14])

num = 19

for i in range(1, 11):
    print(num, 'x', i, '=', num * i)

num = 0
try:
    print(3 / num)
except:
    print("<<< dividing by Zero >>>  ")
