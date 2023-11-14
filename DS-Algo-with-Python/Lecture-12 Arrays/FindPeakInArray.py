from array import *

arr = array('i', [12, 1, 33, 4, 9, 3, 5, 7, 120])
result = 0

for i in range(1, len(arr) - 1):
    if arr[i - 1] < arr[i] and arr[i + 1] < arr[i]:
        if arr[i] > result:
            result = arr[i]

print(result)
