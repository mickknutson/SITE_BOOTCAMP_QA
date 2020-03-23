def evenOdd( x ):

    if (x % 2 == 0):

        print ("even")

    else:

        print ("odd")
evenOdd(2)

evenOdd(3)
# a use of raw_input()

name = input("Enter your full name: ")
#in this way i used finding the index of the seperation character and then substring starting from
#the defind index+1 to not include the seperation character with the surname
index=1+name.index(' ',2)
print (name[(index):]);
#in this way i used pre-defind method in python
print (name.split()[1]);