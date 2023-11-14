# Day 1 - 11, 15, 10, 6
# Day 2 - 10, 14, 11, 5
# Day 3 - 12, 17, 12, 8
# Day 4 - 15, 18, 14, 9

import numpy as np

# Create a 2D array
twoDArray = np.array([[11, 15, 10, 6], [10, 14, 11, 5], [12, 17, 12, 8], [15, 18, 14, 9]])
print(twoDArray)

# Insertion in array
print()
twoDArray2 = np.insert(twoDArray, 0, [[1, 2, 3, 4]], axis=1)
print(twoDArray2)

print()
twoDArray2 = np.append(twoDArray, [[5, 6, 7, 8]], axis=0)
print(twoDArray2)

# Access an element in 2D array
print()
def accessElements(array, rowIndex, colIndex):
    if rowIndex >= len(array) or colIndex >= len(array[0]):
        print("Out of bounds")
    else:
        print(array[rowIndex][colIndex])

accessElements(twoDArray, 3, 3)

# Traversing 2D array
print()
def traversTDArray(array):
    for i in range(len(array)):
        for j in range(len(array[0])):
            print(array[i][j])

traversTDArray(twoDArray)

# Searching 2D array
print()
def searchTDArray(array, value):
    for i in range(len(array)):
        for j in range(len(array[0])):
            if array[i][j] == value:
                return f"Found in position row: {i} column: {j}"
    return "Not found."

print(searchTDArray(twoDArray, 14))

# Delete a row or column
print()
twoDArray_C = np.delete(twoDArray, 0, axis=0)
print(twoDArray_C)

