hexa = input("Enter a hexadecimal number: ")
dec = int(hexa, 16)
octal = oct(dec).replace("0o", "")

print(f"{hexa} = {octal}")
