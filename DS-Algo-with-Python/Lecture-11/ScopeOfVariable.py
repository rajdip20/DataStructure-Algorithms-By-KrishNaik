x = 300     # Global Scope

def myfunc():
    print(x)    # Global Scope print
    y = 20      # Local Scope
    print(y)    # Local Scope Print

    def myinnerfunc():      # Function within the function
        print(x)    # Global Scope print
        print(y)    # Local Scope print
        z = 100     
        print(z)
    myinnerfunc()

myfunc()
