row = 5

for i in range(1, row + 1):
    for j in range(1, row + 1):
        if i == j or j == 6 - i:
            print("*", end="")
        else:
            print(" ", end="")
        
    print("")
