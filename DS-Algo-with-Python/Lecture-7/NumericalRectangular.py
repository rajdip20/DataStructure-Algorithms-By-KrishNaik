r = int(input("Enter row: "))

for i in range(1, r + 1):
    for j in range(r):
        if (i + j) > r:
            print((i + j) - r, end="")
        else:
            print(i + j, end="")
    print("")
