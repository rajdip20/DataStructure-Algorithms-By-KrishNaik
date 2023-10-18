binary1 = input("Enter 1st binary number: ")
binary2 = input("Enter 2nd binary number: ")

num1 = int(binary1, 2)
num2 = int(binary2, 2)
addition = num1 + num2

result = bin(addition).replace("0b", "")
print(f"{binary1} + {binary2} = {result}")
