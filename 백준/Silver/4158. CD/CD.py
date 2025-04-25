import sys

input = sys.stdin.read
data = input().split()
index = 0

results = []

while True:
    N = int(data[index])
    M = int(data[index + 1])
    index += 2
    if N == 0 and M == 0:
        break

    cd_sang = list(map(int, data[index:index+N]))
    cd_sun = list(map(int, data[index+N:index+N+M]))
    index += N + M

    i = j = 0
    count = 0

    while i < N and j < M:
        if cd_sang[i] == cd_sun[j]:
            count += 1
            i += 1
            j += 1
        elif cd_sang[i] < cd_sun[j]:
            i += 1
        else:
            j += 1

    results.append(str(count))

# 결과 출력
print("\n".join(results))
