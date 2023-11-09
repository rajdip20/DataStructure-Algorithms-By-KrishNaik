import math

class Triangle:
    a = 0
    b = 0
    c = 0

    def getArea(self):
        s = (self.a + self.b + self.c) / 2

        return math.sqrt(s * (s - self.a) * (s - self.b) * (s - self.c))
    
    def getPerimeter(self):

        return (self.a + self.b + self.c) / 2


obj = Triangle()
obj.a = 2
obj.b = 5
obj.c = 6

print(obj.getArea())
print(obj.getPerimeter())
