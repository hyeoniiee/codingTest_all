def is_palindrome(word):
    if word == word[::-1]:
        return 1
    else:
        return 0

# 입력 받기
word = input().strip()
print(is_palindrome(word))
