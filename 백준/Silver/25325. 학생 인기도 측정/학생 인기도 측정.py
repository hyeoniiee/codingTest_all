n = int(input())
students = input().split()

popularity = {name: 0 for name in students}

for _ in range(n):
    liked = input().split()
    for name in liked:
        popularity[name] += 1

sorted_result = sorted(popularity.items(), key=lambda x: (-x[1], x[0]))

for name, count in sorted_result:
    print(name, count)
