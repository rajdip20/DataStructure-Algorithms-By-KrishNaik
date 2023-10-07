import math

s = int(input("Enter the length of a side: "))
ans = (6 * pow(s, 2)) / (4 * math.tan(math.pi/6))
print("The area of the hexagon is: ", ans)
