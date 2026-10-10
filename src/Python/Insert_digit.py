test = int(input())

while test > 0:
    n, digit = input().split()
    number = input()

    inserted = False
    for i in range(len(number)):
        if number[i] < digit:
            print(number[:i] + digit + number[i:])
            inserted = True
            break

    if not inserted:
        print(number + digit)

    test -= 1
