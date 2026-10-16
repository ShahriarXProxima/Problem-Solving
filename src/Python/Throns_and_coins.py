test = int(input())

while test > 0:
    length = int(input())
    path = input()

    collection = 0
    for i in range(0, length):
        if i < length - 1 and path[i] == "*" and path[i + 1] == "*":
            break
        
        if path[i] == "@":
            collection += 1

    print(collection)
    test -= 1
