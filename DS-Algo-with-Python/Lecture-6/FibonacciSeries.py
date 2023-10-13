num = int(input("Enter maximum frequency: "))
a = 1
b = 1

for i in range(1, num + 1):
    print(a, end=" ")
    sum = a + b
    a = b
    b = sum
