from array import *
    
def Count(arr, value):
    count = 0
    for i in range(len(arr)):
        if arr[i] == value:
            count += 1
    return count

n = int(input("Enter size of array: "))

arr = array("i")
print("Enter the elements: ")
for i in range(n):
    arr.append(int(input()))

value = int(input("Enter value you want to count: "))

print(f"The value {value} occurred {Count(arr, value)} times in array.")
