height = int(input("Enter the height: "))

for i in range(height, 0, -1):
    for j in range(i, 0, -1):
        print("*", end="")
    print("")
