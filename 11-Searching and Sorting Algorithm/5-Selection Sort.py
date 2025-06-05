def selection_sort(lst):
    # Your code goes here
    n = len(lst)
    
    for i in range(n):
        min_idx = i
        
        for j in range(i+1, n):
            if lst[min_idx] > lst[j]:
                min_idx = j
                
        lst[min_idx], lst[i] = lst[i], lst[min_idx]
        
    return lst


arr = [34, 56, 12, 23, 67, 90, 89, 45, 78]
print(selection_sort(arr))