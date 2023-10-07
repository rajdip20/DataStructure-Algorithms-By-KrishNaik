import math

n = int(input("Input the number of sides on the polygon: "))
s = int(input("Input the length of one of the sides: "))

ans = (n * pow(s, 2)) / (4 * math.tan(math.pi/n))
print("The area is: ", ans)
