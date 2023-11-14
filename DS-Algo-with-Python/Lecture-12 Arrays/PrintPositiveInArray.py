from array import *

arr = array('i', [2, 6, -5, -1, 0, 4, -9])

for i in range(len(arr)):
    if arr[i] % 2 == 0:
        print(arr[i])
