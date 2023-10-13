n = int(input("Enter bulb count: "))

for i in range(1, n):
    if i * i < n:
        print(i * i, end = " ")
