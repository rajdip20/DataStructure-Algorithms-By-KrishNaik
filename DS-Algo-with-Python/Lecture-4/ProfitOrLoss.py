cp = int(input("Enter cost price: "))
sp = int(input("Enter selling price: "))

if cp > sp:
    loss = cp - sp
    print(f"Loss = {loss}")
else:
    profit = sp - cp
    print(f"Profit = {profit}")
