# Store apple's stock price for 5 days and answer
stock_price = [298, 305, 320, 301, 292]

# 1. What was the price on day 1?
print("Price on day 1:", stock_price[0])

# 2. What was the price on day 3?
print("Price on day 3:", stock_price[2])        # Lookup by index, the complexity is O(1) means constant

# 3. On what day the price was 301?
for i in range(len(stock_price)):
    if stock_price[i] == 301:
        print("The day was:", i+1)              # Lookup by value, the complexity is O(n) means linear

# 4. Print all prices.
for i in range(len(stock_price)):
    print(f"Day {i+1}: {stock_price[i]}")         # Array Traversal, the complexity is O(n) means linear

# 5. Insert new price 284 at index 1.
stock_price.insert(1, 284)                      # Array insertion, the time complexity is O(n)
print(stock_price)

# 6. Delete element at index 1.
stock_price.remove(305)                         # Array deletion, the time complexity is O(n)
print(stock_price)

# 7. Make a 2D array
Twod_array = [[211, 123, 542],
              [832, 623, 928],
              [372, 988, 422]]

# 8. Print 623 from the 2D array
print(Twod_array[1][1])                         # Lookup by index, the complexity is O(1) means constant
