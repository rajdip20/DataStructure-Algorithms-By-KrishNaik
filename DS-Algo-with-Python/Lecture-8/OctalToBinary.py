octal = input("Enter an octal number: ")
dec = int(octal, 8)

binary = bin(dec).replace("0b", "")
print(f"{octal} = {binary}")
