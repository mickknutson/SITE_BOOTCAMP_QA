def divide():
    x = float(input("Enter The First Number = "))
    y = float(input("Enter The Second Number = "))
    return x , y


x, y = divide()
try:
    print(f"{x} / {y} is {x / y}")
except ZeroDivisionError:
    print('Unable to Divide by ZERO')
    x , y = divide()
