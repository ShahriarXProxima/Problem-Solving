def Verity(n):
    if n == 1:
        return []
    k = (n + 1) // 2
    return [(j, min(j + k - 1, n)) for j in range(1, k + 1)]


t = int(input())
for _ in range(t):
    n, m = map(int, input().split())
    res = Verity(n)
    print(len(res))
    for u, v in res:
        print(u, v)
