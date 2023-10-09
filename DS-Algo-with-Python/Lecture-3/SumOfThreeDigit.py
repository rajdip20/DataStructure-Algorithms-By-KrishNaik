number = int(input("Enter a 3 digit number = "))
sum = 0

while number > 0:
    sum += number % 10
    number //= 10

print(int(sum))
