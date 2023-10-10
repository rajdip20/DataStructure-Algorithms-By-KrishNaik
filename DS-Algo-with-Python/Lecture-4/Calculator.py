ch = input("Enter an operator (+,-,*,/,%): ")

num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))

if ch == '+':
    print(f"{num1} + {num2} = {num1 + num2}")
elif ch == '-':
    print(f"{num1} - {num2} = {num1 - num2}")
elif ch == '*':
    print(f"{num1} x {num2} = {num1 * num2}")
elif ch == '/':
    print(f"{num1} / {num2} = {num1 / num2}")
elif ch == '%':
    print(f"{num1} % {num2} = {num1 % num2}")
else:
    print("Enter a valid operator.")
