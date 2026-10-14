test = int(input())

while test > 0:
    n, m, x, y = map(int, input().split())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))

    print(n + m)
    test -= 1
