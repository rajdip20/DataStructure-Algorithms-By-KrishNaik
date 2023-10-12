num = 1

while True:
    if (num % 5 == 0) and (num % 7 == 0):
        print(f"{num} is multiple of 5 and 7.")
        break
    num += 1
