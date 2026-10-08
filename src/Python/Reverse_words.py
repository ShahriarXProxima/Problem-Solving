text = list(input().split())

for i, item in enumerate(text):
    reversed_text = "".join(reversed(item))
    print(reversed_text, end="" if i == len(text) - 1 else " ")

print()
