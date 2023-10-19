binary = input("Enter a binary number: ")
dec = int(binary, 2)

hexa = hex(dec).replace("0x", "")
print(f"{binary} = {hexa}")
