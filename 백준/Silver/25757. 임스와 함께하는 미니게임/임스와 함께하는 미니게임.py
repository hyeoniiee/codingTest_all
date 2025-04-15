import sys
input = sys.stdin.readline

n, game = input().split()
required = {'Y': 2, 'F': 3, 'O': 4}[game]  # 딕셔너리로 바로 맵핑

players = set()  # 중복 없이 저장

for _ in range(int(n)):
    players.add(input().strip())  # strip()으로 개행 제거

print(len(players) // (required - 1))
