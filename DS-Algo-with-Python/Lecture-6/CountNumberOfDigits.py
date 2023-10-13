number = int(input("Enter a number: "))
sum = 0

while number > 0:
    sum += 1
    number //= 10

print(f"You entered {sum} digit number.")
