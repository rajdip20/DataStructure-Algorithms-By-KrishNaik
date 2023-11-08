def count(s):
    count = 0
    for i in range(len(s)):
        ch = s[i]

        if ch == 'a' or ch == 'e' or ch == 'i' or ch == 'o' or ch == 'u':
            count += 1
        
    return count

s = input("Enter the string: ")
print(f"Vowel = {count(s)}")
