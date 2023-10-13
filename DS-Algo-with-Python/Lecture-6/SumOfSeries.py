number = int(input("Enter maximum frequency: "))
sum = 0

for i in range(number + 1):
    if i % 2 != 0:
        sum += i
    else:
        sum -= i

print(f"Sum of 1 to {number} is: {sum}")
