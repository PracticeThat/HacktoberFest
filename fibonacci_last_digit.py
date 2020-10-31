# Find the Last Fibonacci Number
import math


def get_fibonacci_last_digit_naive(n):
    fib_array = [0, 1]
    result = 0

    if(n == 0):
        result = 0
    elif(n == 1):
        result = 1
    else:
        for i in range(2, n+1):
            result = (fib_array[i-2] + fib_array[i-1]) % 10
            fib_array.append(result)

    return result


if __name__ == '__main__':
    n = int(input())
    print(get_fibonacci_last_digit_naive(n))
