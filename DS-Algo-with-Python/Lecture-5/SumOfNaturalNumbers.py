number = int(input("Enter a number: "))
num = 1
sum = 0

while num <= number:
    sum += num
    num += 1
    
print(f"Sum of first {number} natural number is = {sum}")
