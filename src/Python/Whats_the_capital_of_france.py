test = int(input())

while test > 0:
    n = int(input())
    a = list(map(int, input().split()))

    total_or = 0
    min_val = a[0]
    max_val = a[0]

    for x in a:
        total_or |= x
        if x < min_val:
            min_val = x
        if x > max_val:
            max_val = x

    ans = total_or

    for h in range(31):
        if (max_val >> h) & 1:
            v_h = ((max_val >> (h + 1)) << (h + 1)) | ((1 << h) - 1)
            if v_h >= min_val:
                ans |= (1 << h) - 1

    print(ans)
    test -= 1