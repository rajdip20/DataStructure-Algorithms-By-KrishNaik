octal = input("Enter an Octal number: ")
dec = int(octal, 8)
hexa = hex(dec).replace("0x", "")

print(f"{octal} = {hexa}")
