## Even Or Odd Function


def evenOdd(x):
    if (x % 2 == 0):
        print("Even")
    else:
        print("Odd")


evenOdd(2)
evenOdd(3)

## String Manipulation
name = "Hisham BinSeddeq"
print(name)

## Loop

for i in range(1,20):
    print(f"the value of 19 * {i} = {i * 19}")

## Lists

list1 = ["Hi", "hello", "why", "this"]
list2 = ["Hi", "hello", "why", "this"]

for item in enumerate(list1):
    print(item)
print(list2)

print("hello")

## Dictionary

dic1 = {"user_name":"hbs",
        "password":123}

print(dic1)

## exception

try:
    print(1/0)
except:
    print("can't devide by zero")
