binary1 = input("Enter 1st binary number: ")
binary2 = input("Enter 2nd binary number: ")

num1 = int(binary1, 2)
num2 = int(binary2, 2)
multiply = num1 * num2

result = bin(multiply).replace("0b", "")
print(f"{binary1} x {binary2} = {result}")
