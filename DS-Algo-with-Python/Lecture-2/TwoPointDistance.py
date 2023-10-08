import math

x1 = math.radians(float(input("Input the latitude of coordinate 1: ")))
y1 = math.radians(float(input("Input the longitude of coordinate 1: ")))
x2 = math.radians(float(input("Input the latitude of coordinate 2: ")))
y2 = math.radians(float(input("Input the longitude of coordinate 2: ")))
earthRadius = 6371.01

distance = earthRadius * math.acos((math.sin(x1) * math.sin(x2)) + (math.cos(x1) * math.cos(x2) * math.cos(y1 - y2)))

print(f"The distance between those points is: {distance} km")
