height = int(input("Enter height: "))

for i in range(1, height + 1):
    for k in range(1, height - i + 1):
        print(" ", end="")

    for j in range(1, 2 * i):
        if j >= i:
            print((i * 2) - j, end="")
        else:
            print(j, end="")

    print("")
