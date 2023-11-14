from array import *
    
def Great(arr, value):
    count = 0
    for i in range(len(arr)):
        if arr[i] > value:
            count += 1
    return count

n = int(input("Enter size of array: "))

arr = array("i")
print("Enter the elements: ")
for i in range(n):
    arr.append(int(input()))

value = int(input("Enter value: "))

print(f"There are {Great(arr, value)} elements greater than {value}")
