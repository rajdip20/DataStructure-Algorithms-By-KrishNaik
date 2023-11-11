def changeValue(a):
    a *= 100
    print(f"Inside change value {a}")

a = 10
print(f"Before changing value {a}")
changeValue(a)
print(f"After changing value {a}")


# Python doesn't have Pass by Reference.
