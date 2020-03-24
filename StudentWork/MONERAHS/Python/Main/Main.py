def evenOdd(x):
    if (x % 2 == 0):
        print("even")
    else:
        print("odd")


evenOdd(6)
evenOdd(5)



#######################

String ="Monerah Balhareth"
print(String)

######################
def table(num):
    for x in range(1,11):
        print (num," * ", x,"=",num*x)

table(19)

#####################
#ASSIGNMENT#

def f(x):
    return x/0
try:
   print(f(5))
except ValueError:
    print(" Divide by Zero Exception !!! ")

