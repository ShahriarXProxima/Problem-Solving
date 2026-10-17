test = int(input())

while test > 0:
    n = int(input())
    s = input()

    k = s.count('1')
    if k == 1:
        print(0)
    elif k == 2:
        print(1)
    else:
        first = s.find('1') + 1
        last = s.rfind('1') + 1
        print(last - first)

    test -= 1