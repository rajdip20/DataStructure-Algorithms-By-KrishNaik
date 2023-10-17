n = int(input("Enter the height of the triangle: "))

for i in range(1, n + 1):
    for k in range(0, n - i):
        print(" ", end="")
    
    x = 1
    for j in range(1, i + 1):
        print(x, end=" ")
        x = x * (i - j) // j
    
    print("")
