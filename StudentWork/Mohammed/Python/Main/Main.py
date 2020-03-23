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