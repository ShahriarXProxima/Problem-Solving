test = int(input())

while test > 0:
    n = int(input())
    nums = list(map(int, input().split()))
    seen = set()

    for i in range(n - 1, -1, -1):
        if nums[i] in seen:
            break
        seen.add(nums[i])

    print(n - len(seen))
    test -= 1