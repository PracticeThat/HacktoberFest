# Find the Fibonacci Series


def fibonacci_series(num):
    fib_array = [0, 1]

    if num == 0:
        return 0
    elif num == 1:
        return 1
    else:
        for i in range(2, num+1):
            result = fib_array[i-2] + fib_array[i-1]
            fib_array.append(result)

    return fib_array[-1]


if __name__ == '__main__':
    num = int(input())
    print(fibonacci_series(num))
