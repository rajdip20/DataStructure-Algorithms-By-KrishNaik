num = int(input("Enter a number: "))


def isPrime(n):
    if n <= 1:
        return False

    for i in range(2, n):
        if i * i < n:
            if n % i == 0:
                return False
    return True


if isPrime(num) and isPrime(num - 2):
    print(True)
else:
    print(False)

