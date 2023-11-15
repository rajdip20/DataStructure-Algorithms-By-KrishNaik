from array import *
    
def Last(arr, value):
    location = -1
    for i in range(len(arr)):
        if arr[i] == value:
            location = i
    return location

n = int(input("Enter size of array: "))

arr = array("i")
print("Enter the elements: ")
for i in range(n):
    arr.append(int(input()))

value = int(input("Enter value for see last occurrence: "))

print(f"The value {value} last occurred at {Last(arr, value)} position in array.")
