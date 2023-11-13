from array import *

# 1. Create an array and traverse.
arr = array('i', [8, 6, 7, 9])
for i in arr:
    print(i)

# 2. Access individual elements through indexes
print("\nStep 2")
print(arr[0])
print(arr[1])
print(arr[2])
print(arr[3])

# 3. Append any value to the array using append() method
print("\nStep 3")
arr.append(3)
print(arr)

# 4. Insert value in an array using insert() method
print("\nStep 4")
arr.insert(1, 2)
print(arr)

# 5. Extend python array using extend() method
print("\nStep 5")
arr2 = array('i', [1, 3, 5, 5])
arr.extend(arr2)
print(arr)

# 6. Add items from list into array using fromlist() method
print("\nStep 6")
tempList = [11, 12, 13]
arr.fromlist(tempList)
print(arr)

# 7. Remove any array element using remove() method
print("\nStep 7")
arr.remove(3)
print(arr)

# 8. Remove last array element using pop() method
print("\nStep 8")
arr.pop()
print(arr)

# 9. Fetch any index through its element using index() method
print("\nStep 9")
print(arr.index(5))

# 10. Reverse a python array using reverse() method
print("\nStep 10")
arr.reverse()
print(arr)

# 11. Get array buffer information through buffer_info() method
print("\nStep 11")
print(arr.buffer_info())

# 12. Check for number of occurrences of an element using count() method
print("\nStep 12")
print(arr.count(5))

# 13. Convert array to bytes using tobytes() method
print("\nStep 13")
Strbyte = arr.tobytes()
print(Strbyte)

# 14. Convert array to a python list with same elements using tolist() method
print("\nStep 14")
print(arr.tolist())

# 15. Append a string to char array using frombytes() method
print("\nStep 15")
arr3 = array("i")
arr3.frombytes(Strbyte)
print(arr3)

# 16. Slice Elements from an array
print("\nStep 16")
print(arr[0:6])
