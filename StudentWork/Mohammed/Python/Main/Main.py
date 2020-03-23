def evenOdd(x):

    if (x % 2 == 0):
        print("even")
    else :
        print ("odd")


evenOdd(2)

evenOdd(3)

##############
#---------------
#- String Lab
######

fName = "mohammed"
lName = "Aldawsari"

print(fName + " " + lName)

#-------------
#- for Loob/If statments

x = 19
print("Multiplication Table of", x)
for i in range(1, 11):
   print(x,"X",i,"=",x * i)

# --- Lists & Tuples
list1 = ["apple", "Orange"]
print(list1)

# tupl1 = ("moe" , "Jack" , "Khalied")
# print(tupl1)

# Indexing!
print(list1[0:1])

## homework -- Exception divide by zero // chnuk norris
x = 500
y = 0

try:
    print(x/y)
except:
    print("You cannot divide By 0 ")
finally:
    print("Exception Check has been done!")
