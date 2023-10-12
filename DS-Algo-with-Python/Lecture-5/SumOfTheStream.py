num1 = int(input("Enter first value: "))
num2 = int(input("Enter last value: "))
sum = 0

for i in range(num1, num2 + 1):
    sum += i

print(f"Sum of {num1} to {num2} is = {sum}")
