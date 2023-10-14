row = 5
s = 'A'

for i in range(1, row + 1):
    for k in range(row, i, -1):
        print(" ", end="")
    for j in range(0, (i * 2)-1):
        print(chr(ord(s) + j), end="")
    print("")


for i in range(row - 1, 0 , -1):
    for k in range(row, i, -1):
        print(" ", end="")

    for j in range((i * 2) - 1):
        print(chr(ord(s) + j), end="")
    
    print("")
