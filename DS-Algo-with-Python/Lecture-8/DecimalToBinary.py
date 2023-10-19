dec = int(input("Enter a decimal number: "))
binary = bin(dec).replace("0b", "")

print(f"{dec} = {binary}")
