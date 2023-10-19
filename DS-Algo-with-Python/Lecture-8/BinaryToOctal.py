binary = input("Enter a binary number: ")
dec = int(binary, 2)

octal = oct(dec).replace("0o", "")
print(f"{binary} = {octal}")
