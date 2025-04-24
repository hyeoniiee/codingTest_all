import sys
import bisect

input = sys.stdin.read
data = input().split()

N = int(data[0])
M = int(data[1])

A = list(map(int, data[2:2+N]))
queries = list(map(int, data[2+N:]))

# 정렬된 배열 B
B = sorted(A)

# 각 쿼리에 대해 이진 탐색 수행
results = []
for D in queries:
    idx = bisect.bisect_left(B, D)
    if idx < len(B) and B[idx] == D:
        results.append(str(idx))
    else:
        results.append("-1")

print('\n'.join(results))
