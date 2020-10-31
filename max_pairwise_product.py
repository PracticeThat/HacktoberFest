# Find the maximum product of two elements in a array


def max_pairwise_product(numbers):

    numbers.sort()
    return numbers[-1]*numbers[-2]


if __name__ == '__main__':
    total_nums = int(input())
    numbers = [int(i) for i in input().split()]
    print(max_pairwise_product(numbers))
