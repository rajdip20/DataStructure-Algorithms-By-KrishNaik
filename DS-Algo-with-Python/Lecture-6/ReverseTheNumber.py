number = int(input("Enter a number: "))
revnum = 0

while number > 0:
    rem = number % 10
    revnum = revnum * 10 + rem
    number //= 10

print(f"Reverse of the number is: {revnum}")
