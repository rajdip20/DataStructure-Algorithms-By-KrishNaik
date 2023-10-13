number = int(input("Enter a number: "))
fact = 1

for i in range(1, number + 1):
    fact *= i
    print(f"Factorial of {i} is: {fact}")

