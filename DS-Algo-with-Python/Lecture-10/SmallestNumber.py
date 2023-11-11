def Smallest(a, b, c):
    return min(a, min(b, c))

a = int(input("Enter 1st number: "))
b = int(input("Enter 2nd number: "))
c = int(input("Enter 3rd number: "))

print(f"The smallest number is: {Smallest(a, b, c)}")
