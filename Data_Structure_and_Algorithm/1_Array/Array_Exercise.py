# 1. Let us say your expense for every month are listed below,
# January - 2200
# February - 2350
# March - 2600
# April - 2130
# May - 2190
# Create a list to store these monthly expenses and using that find out,

monthly_expenses = [2200, 2350, 2600, 2130, 2190]

# i. In Feb, how many dollars you spent extra compare to January?
print("Feb extra expense compared to Jan: ", monthly_expenses[0] - monthly_expenses[1])

# ii. Find out your total expense in first quarter (first three months) of the year.
print("Total expense in firsst quarter: ", monthly_expenses[0] + monthly_expenses[1] + monthly_expenses[2])

# iii. Find out if you spent exactly 2000 dollars in any month
for i in range(len(monthly_expenses)):
    if monthly_expenses[i] == 2000:
        print(f"In month {i + 1}, the spent exactly 2000 dollars.")
    else:
        print("There are no month which have exactly spent 2000 dollars.")

# iv. June month just finished and your expense is 1980 dollar. Add this item to our monthly expense list
monthly_expenses.append(1980)
print(monthly_expenses)

# v. You returned an item that you bought in a month of April and got a refund of 200$. Make a correction to your monthly expense list based on this
monthly_expenses[3] = monthly_expenses[3] + 200
print(monthly_expenses)



# 2. You have a list of your favourite marvel super heros.
# heros=['spider man', 'thor', 'hulk', 'iron man', 'captain america']
# Using this find out,

heros = ['spider man', 'thor', 'hulk', 'iron man', 'captain america']

# i. Length of the list
print("The length of the list is: ", len(heros))

# ii. Add 'black panther' at the end of this list
heros.append('black panther')
print(heros)

# iii. You realize that you need to add 'black panther' after 'hulk', so remove it from the list first and then add it after 'hulk'
heros.pop()
heros.insert(3, 'black panther')
print(heros)

# iv. Now you don't like thor and hulk because they get angry easily. So you want to remove thor and hulk from list and replace them with doctor strange. Do that with one line of code.
heros[1:3] = 'doctor strange'
print(heros)

# v. Sort the heros list in alphabetical order.
heros.sort()
print(heros)



# 3. Create a list of all odd numbers between 1 and a max number. Max number is something you need to take from a user using input() function.
user_input = int(input("Enter the maximum number: "))
odd_list = []

for i in range(0, user_input + 1):
    if i % 2 == 1:
        odd_list.append(i)

print(odd_list)
