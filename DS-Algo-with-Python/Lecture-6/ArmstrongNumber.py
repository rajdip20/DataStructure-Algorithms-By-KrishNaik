number = int(input("Enter a number: "))
i = 0

while i < number:
    num = i
    arm = 0

    while num > 0:
        rem = num % 10
        arm = arm + rem * rem * rem
        num //= 10
    
    if arm == i:
        print(i)
    
    i += 1
