class Area:
    length = 0
    breadth = 0
    
    def __init__(self, l, b):
        self.length = l
        self.breadth = b
    
    def getArea(self):
        return self.length * self.breadth
    

l = int(input("Enter length: "))
b = int(input("Enter breadth: "))

obj = Area(l, b)
print(f"Area: {obj.getArea()}")
