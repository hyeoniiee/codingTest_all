# 입력 받기
n, game_type = input().split()
n = int(n)

# 중복 제거를 위해 set 사용
players = set()
for _ in range(n):
    name = input()
    players.add(name)

# 게임에 필요한 최소 인원 수 계산
if game_type == 'Y':
    required = 2
elif game_type == 'F':
    required = 3
elif game_type == 'O':
    required = 4

# 필요한 인원 수에서 임스를 뺀 나머지가 함께할 사람 수
max_games = len(players) // (required - 1)

print(max_games)
