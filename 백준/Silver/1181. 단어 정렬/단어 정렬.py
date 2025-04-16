import sys
input = sys.stdin.readline

n = int(input())
words = set() 

for _ in range(n):
    words.add(input().strip())

sorted_words = sorted(words, key=lambda word: (len(word), word))

for word in sorted_words:
    print(word)
