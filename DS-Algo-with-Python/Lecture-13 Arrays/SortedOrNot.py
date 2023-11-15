from array import *
    
def isSorted(arr):
    check = True
    for i in range(len(arr) - 1):
        if arr[i] > arr[i + 1]:
            check = False
    return check

n = int(input("Enter size of array: "))

arr = array("i")
print("Enter the elements: ")
for i in range(n):
    arr.append(int(input()))

print(f"Sorted: {isSorted(arr)}")