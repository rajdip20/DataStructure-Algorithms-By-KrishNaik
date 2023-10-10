mark = int(input("Enter your marks: "))

if mark < 30 and mark >= 0:
    print("Your grade is F")
elif mark >= 30 and mark < 40:
    print("Your grade is E")
elif mark >= 40 and mark < 50:
    print("Your grade is D")
elif mark >= 50 and mark < 60:
    print("Your grade is C")
elif mark >= 60 and mark < 70:
    print("Your grade is B")
elif mark >= 70 and mark < 80:
    print("Your grade is B+")
elif mark >= 80 and mark < 90:
    print("Your grade is A")
elif mark >= 90 and mark <= 100:
    print("Your grade is A+")
else:
    print("Enter a valid number")
