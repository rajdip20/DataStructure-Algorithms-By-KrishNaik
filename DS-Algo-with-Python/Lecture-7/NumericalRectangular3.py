r = int(input("Enter row: "))
c = int(input("Enter column: "))

for i in range(1, r + 1):
    for j in range(1, c + 1):
        if (j + i) % 2 == 0:
            print(1, end="")
        else:
            print(2, end="")
    print("")
