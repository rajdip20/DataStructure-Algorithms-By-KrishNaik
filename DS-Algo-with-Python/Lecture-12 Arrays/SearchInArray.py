from array import *

arr = array('i', [1, 3, 5, 7, 10, 4])
found = 11
ans = -1

for i in range(len(arr)):
    if arr[i] == found:
        ans = i
        break
print(f"Found {found} at index {ans}")