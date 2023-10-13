num = int(input("Enter a number: "))
mul = 1

if num == 0:
    print("Factorial of 0 = 0")
else:
    for i in range(1, num + 1):
        mul *= i

    print(f"Factorial of {num} = {mul}")

