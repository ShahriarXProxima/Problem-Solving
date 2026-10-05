test = int(input())

while test > 0:
    n, j, k = map(int, input().split())

    players = list(map(int, input().split()))
    target = players[j - 1]
    max_val = max(players)

    if k >= 2 or target == max_val:
        print("YES")
    else:
        print("NO")

    test -= 1