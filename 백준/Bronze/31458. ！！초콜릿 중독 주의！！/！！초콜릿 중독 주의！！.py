import sys

def compute(expression):
    expression = expression.strip()
    count = 0  # 느낌표 개수
    
    # 정수 앞쪽 느낌표 개수 세기
    for ch in expression:
        if ch == '!':
            count += 1
        else:
            break  # 숫자가 나오면 중단
    
    n = int(expression[count])  # 정수 (0 또는 1)
    
    # 정수 뒤쪽 느낌표 개수 세기
    b = len(expression) - count - 1  # 총 길이에서 앞쪽 느낌표와 숫자 제외
    
    if n == 0:  # 정수가 0일 때
        if b != 0:  # 느낌표가 존재하면
            return 1 if count % 2 == 0 else 0
        else:
            return 0 if count % 2 == 0 else 1
    else:  # 정수가 1일 때
        return 1 if count % 2 == 0 else 0

# 입력 처리
T = int(sys.stdin.readline().strip())
for _ in range(T):
    print(compute(sys.stdin.readline().strip()))
