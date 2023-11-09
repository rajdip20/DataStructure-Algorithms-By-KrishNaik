class Calculation:
    real = None
    imag = None

    def __init__(self, r, i):
        self.real = r
        self.imag = i
    
    def add(a, b):
        return Calculation((a.real + b.real), (a.imag + b.imag))
    
    def diff(a, b):
        return Calculation((a.real - b.real), (a.imag - b.imag))
    
    def product(a, b):
        return Calculation((a.real * b.real) - (a.imag * b.imag), (a.real * b.imag) + (a.imag * b.real))
    
    def printComplex(self):
        if self.real == 0 and self.imag != 0:
            print(self.imag + "i")
        elif self.imag == 0 and self.real != 0:
            print(self.real)
        else:
            print(f"{self.real} + {self.imag}i")

real1 = int(input("Enter real part of complex number 1: "))
comp1 = int(input("Enter complex part of complex number 1 without iota sign: "))
real2 = int(input("Enter real part of complex number 2: "))
comp2 = int(input("Enter complex part of complex number 2 without iota sign: "))

c = Calculation(real1, comp1)
d = Calculation(real2, comp2)
e = Calculation.add(c, d)
f = Calculation.diff(c, d)
g = Calculation.product(c, d)

e.printComplex()
f.printComplex()
g.printComplex()
