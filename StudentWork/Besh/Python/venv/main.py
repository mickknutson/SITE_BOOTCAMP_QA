def EvenOdd(x):
	if (x % 2 == 0):
		print (x,'is Even Number')
	else:
		print (x,'is Odd Number')
EvenOdd(2)
EvenOdd(3)
EvenOdd(7)
EvenOdd(10)

def name(s):
   # split the string into a list
   l = s.split ()
   new = ""
   for i in range ( len ( l ) - 1 ):
      s = l[i]
   new += l[-1].title ()
   return new
s = "Besh"
print ( name ( s ) )
