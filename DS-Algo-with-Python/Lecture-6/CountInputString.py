s = input("Enter a string: ")
digit = 0
space = 0
alpha = 0
other = 0

for char in s:
    if char.isdigit():
        digit += 1
    elif char.isspace():
        space += 1
    elif char.isalpha():
        alpha += 1
    else:
        other += 1

print(f"The string is: {s}")
print(f"letter: {alpha}")
print(f"space: {space}")
print(f"number: {digit}")
print(f"other: {other}")
