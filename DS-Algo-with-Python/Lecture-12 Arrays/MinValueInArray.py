from array import *

arr = array('i', [2, -3, 5, 8, 1, 0, -4])
value = arr[0]

for i in range(len(arr)):
    if arr[i] < value:
        value = arr[i]

print(value)
