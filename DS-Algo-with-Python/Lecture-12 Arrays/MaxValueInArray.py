from array import *

arr = array('i', [1, 2, 6, 8, 5, 4])
value = 0

for i in range(len(arr)):
    if arr[i] > value:
        value = arr[i]

print(value)

