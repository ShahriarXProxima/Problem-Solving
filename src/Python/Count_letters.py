str = input()
str_dict = {}

for char in str:
    str_dict[char]= str_dict.get(char, 0)+1

for char in sorted(str_dict):
    print(f"{char} : {str_dict[char]}")   
    
