test = int(input())

while test > 0:
    n = int(input())
    nums = list(map(int, input().split()))
    count = 0
    while len(nums) > len(set(nums)):
        nums.pop(0)
        count += 1

    print(count)
    test -= 1