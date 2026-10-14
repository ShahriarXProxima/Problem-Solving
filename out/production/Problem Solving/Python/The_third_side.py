test = int(input())

while test > 0:
    n = int(input())
    sides = list(map(int, input().split()))

    sum = 0
    for i in range(0, n):
        sum += sides[i]

    print((sum - n) + 1)

    test -= 1
