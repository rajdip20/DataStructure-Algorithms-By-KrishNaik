height = int(input("Enter height: "))

for i in range(1, height + 1):
    for k in range(1, height - i + 1):
        print(" ", end="")

    for j in range(1, 2 * i):
        if (i == 1 or i == height) or (j == 1 or j == (2 * i) - 1):
            print(i, end="")
        else:
            print(" ", end="")
    
    print("")
