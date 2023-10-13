num = int(input("Enter a number: "))
power = int(input("Enter the power: "))
mul = 1

for i in range(1, power + 1):
    mul *= num

print(f"{num} to the power {power} is: {mul}")
