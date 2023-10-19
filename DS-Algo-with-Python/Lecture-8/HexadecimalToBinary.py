hexa = input("Enter a hexadecimal number: ")
dec = int(hexa, 16)
binary = bin(dec).replace("0b", "")

print(f"{hexa} = {binary}")
