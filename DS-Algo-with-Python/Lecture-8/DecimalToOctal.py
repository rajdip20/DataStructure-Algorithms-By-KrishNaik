dec = int(input("Enter a decimal number: "))
octal = oct(dec).replace("0o", "")

print(f"{dec} = {octal}")
