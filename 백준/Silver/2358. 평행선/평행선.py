from collections import Counter
import sys

input = sys.stdin.readline  # 빠른 입력 (입력 크기 클 때 유리)

# 입력
n = int(input())
x_list = []
y_list = []

for _ in range(n):
    x, y = map(int, input().split())
    x_list.append(x)
    y_list.append(y)

# x좌표, y좌표 각각 카운트
x_count = Counter(x_list)
y_count = Counter(y_list)

# 조건을 만족하는 x/y 좌표 수 세기
result = sum(1 for count in x_count.values() if count >= 2)
result += sum(1 for count in y_count.values() if count >= 2)

print(result)
