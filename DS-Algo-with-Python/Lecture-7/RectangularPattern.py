r = int(input("Enter row number: "))
c = int(input("Enter column number: "))

for i in range(1, r + 1):
    for j in range(1, c + 1):
        print("*", end="")
    print("")
