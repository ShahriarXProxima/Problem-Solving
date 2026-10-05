test = int(input())

while test > 0:
    x, y = map(int, input().split())

    if x % y == 0:
        print("YES")
    else:
        print("NO")
        
    test -= 1
