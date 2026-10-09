test = int(input())

while test > 0:
    n = int(input())
    melody = input()
    melody_list = []

    i = 0
    j = 1

    while j < len(melody):
        new_melody = melody[i] + melody[j]
        if new_melody not in melody_list:
            melody_list.append(new_melody)
        i += 1
        j += 1

    print(len(melody_list))

    test -= 1
