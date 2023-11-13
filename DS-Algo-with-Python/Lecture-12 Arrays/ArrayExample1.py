from array import *

# Create an array
arr1 = array('i', [1, 2, 3, 4, 5, 6])
arr2 = array('d', [1.3, 1.5, 1.6])

print("Create array")
print(arr1)

# Insert in array
arr1.insert(0, 0)
print("\nInsert array")
print(arr1)

# Traversal in array
print("\nTraversal in array")
def traverseArray(array):
    for i in array:
        print(i)

traverseArray(arr1)

# Access array element
print("\nAccess an element of an array")
def accessElement(array, index):
    if index >= len(array):
        print("out of bounds")
    else:
        print(array[index])

accessElement(arr1, 4)

# Search in array
print("\nSearch in array")
def searchElement(array, value):
    for i in array:
        if i == value:
            return f"This element is in index: {array.index(value)}"
    return "This element doesn't exist."

print(searchElement(arr1, 5))

# Delete an element in array
print("\nRemove an element")
arr1.remove(0)  # array.remove(element)
print(arr1)
