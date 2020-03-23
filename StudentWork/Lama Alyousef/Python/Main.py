# Even and Odd Function

def evenOdd(x):
    if (x% 2 == 0):
        print("even");
    else:
        print("odd")

evenOdd(2)
evenOdd(3)

# loop of multiplication table of 19

num = 19
for i in range(1,11):
    print (num, 'x', i, "=", num * i)