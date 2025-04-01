import sys
lines = sys.stdin.read().splitlines()

for line in lines:
    small, large, number, space = 0, 0, 0, 0 
    
    for char in line: 
        if char.islower(): 
            small += 1
        elif char.isupper():
            large += 1
        elif char.isdigit(): 
            number += 1
        elif char.isspace():
            space += 1
    
    print(small, large, number, space)
