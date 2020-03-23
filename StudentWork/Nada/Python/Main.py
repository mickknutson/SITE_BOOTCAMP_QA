num = int(input("Enter a number: "))
if (num % 2) == 0:
   print("{0} is Even number".format(num))
else:
   print("{0} is Odd number".format(num))


def name(s):
   # split the string into a list 
   l = s.split ()
   new = ""
   for i in range ( len ( l ) - 1 ):
      s = l[i]
   new += l[-1].title ()
   return new

s = "Nada Aljohani"
print ( name ( s ) )
