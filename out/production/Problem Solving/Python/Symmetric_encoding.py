test = int(input())

while test > 0:
    n = int(input())
    b = input()

    r = sorted(set(b))
    mp = {}

    left = 0
    right = len(r) - 1

    while left <= right:
        mp[r[left]] = r[right]
        mp[r[right]] = r[left]

        left += 1
        right -= 1

    ans = ""

    for ch in b:
        ans += mp[ch]

    print(ans)

    test += 1
