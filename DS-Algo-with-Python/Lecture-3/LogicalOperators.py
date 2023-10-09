p = 15
q = 10
r = 5

# AND Operator
print((p > q) and (p > r))  # True
print((p > q) and (p < r))  # False

# OR Operator
print((r < q) or (p < q))   # True
print((p > q) or (q > r))   # True
print((p < q) or (q < r))   # False

# NOT Operator
print(not(p == q))          # True
print(not p > q)            # False
