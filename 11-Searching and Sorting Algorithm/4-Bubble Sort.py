def bubble_sort(lst):
    n = len(lst)

    for i in range(n):
        for j in range(n - (1 + i)):
            if lst[j] > lst[j+1]:
                lst[j], lst[j+1] = lst[j+1], lst[j]
    
    return lst


unsorted_list = [25, 96, 42, 12, 35, 74, 90, 15]
sorted_list = bubble_sort(unsorted_list)
print(sorted_list)
