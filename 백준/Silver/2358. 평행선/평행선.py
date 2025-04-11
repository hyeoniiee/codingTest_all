from collections import defaultdict

# 입력 받기
n = int(input())
x_count = defaultdict(int)  # x좌표 빈도수 저장
y_count = defaultdict(int)  # y좌표 빈도수 저장

# 각 좌표의 x, y를 카운팅
for _ in range(n):
    x, y = map(int, input().split())
    x_count[x] += 1
    y_count[y] += 1

# 직선의 개수 세기
result = 0

# x좌표가 같은 점이 2개 이상 => 수직선 존재
for count in x_count.values():
    if count >= 2:
        result += 1

# y좌표가 같은 점이 2개 이상 => 수평선 존재
for count in y_count.values():
    if count >= 2:
        result += 1

# 결과 출력
print(result)
