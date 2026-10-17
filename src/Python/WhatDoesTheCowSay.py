
t = int(input())

for _ in range(t):
    n, k = map(int, input().split())
    mooRBS = input().strip()

    total = n // 2
    stack = []
    nodes = 0
    component_start = 0
    best = 1
    boosted = 1

    for ch in mooRBS:
        if ch == '(':
            if not stack:
                component_start = nodes

            depth = len(stack)
            local_index = nodes - component_start
            local_cost = local_index - depth
            global_cost = nodes - depth

            low, high = 0, len(stack)
            threshold = local_cost - k

            while low < high:
                mid = (low + high) // 2
                if stack[mid][0] >= threshold:
                    high = mid
                else:
                    low = mid + 1

            if low < len(stack):
                ancestor_depth = stack[low][1]
            else:
                ancestor_depth = depth

            length = depth - ancestor_depth + 1
            best = max(best, length)

            if global_cost <= k:
                boosted = max(
                    boosted,
                    min(total, k + depth + 1)
                )

            stack.append((local_cost, depth))
            nodes += 1
        else:
            stack.pop()

    print(max(best, boosted))
