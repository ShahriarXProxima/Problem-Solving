test = int(input())

while test > 0:
    n = int(input())
    arr = list(map(int, input().split()))

    arr.sort()
    print(arr[n - 1] - arr[0])

    test -= 1
