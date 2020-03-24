import re as regex


def checkPhoneNumbers(number):
    pattern= "^00966([0-9]{9})$"
    resullt= regex.match(pattern,number)
    if resullt:
        print("This number from Saudi Arabia!!")
    else:
        print("Cant recognize this number")




checkPhoneNumbers("00966505425566")