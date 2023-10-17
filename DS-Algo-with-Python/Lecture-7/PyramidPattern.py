height = int(input("Enter the height: "))

for i in range(1, height + 1):
    for k in range(0, height - i):
        print(" ", end="")
    
    for j in range(1, (2 * i)):
        print("*", end="")
    
    print("")
