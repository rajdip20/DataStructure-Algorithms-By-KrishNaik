number = int(input("Enter a number: "))
sum = 0

while number > 0:
    sum += number % 10
    number //= 10

print(f"Sum of the digits of the number is: {sum}")
