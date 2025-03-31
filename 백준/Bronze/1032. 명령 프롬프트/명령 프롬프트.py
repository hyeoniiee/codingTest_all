def find_pattern(file_names):
    n = len(file_names)
    pattern = list(file_names[0])
    
    for i in range(len(pattern)):  
        for j in range(1, n):  
            if file_names[j][i] != pattern[i]:  
                pattern[i] = '?'
                break  
    
    return "".join(pattern)  

n = int(input()) 
file_names = [input().strip() for _ in range(n)] 

print(find_pattern(file_names))
