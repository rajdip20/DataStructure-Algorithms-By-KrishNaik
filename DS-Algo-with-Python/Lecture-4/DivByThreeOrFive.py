number = int(input("Enter a number: "))

if (number % 3 == 0) or (number % 5 == 0):
    if (number % 3 == 0) and (number % 5 == 0):
        print("The number is divisible by 3 and 5.")
    elif number % 3 == 0:
        print("The number is divisible by 3.")
    else:
        print("Ther number is divisible by 5.")
