count = 0

for i in range(1, 5):
    for j in range(1, 5):
        for k in range(1, 5):
            if k != i and k != j and i != j:
                count += 1
                print(f"{i}{j}{k}")

print(f"Total number of the three-digit-number is: {count}")
