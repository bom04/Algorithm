from collections import deque


def solution(phone_book):
    answer = True
    phone_book.sort()
    for i in range(len(phone_book)-1):
        if phone_book[i+1].startswith(phone_book[i]):
            return False
    return True

if __name__=="__main__":
    print(solution(["119", "97674223", "1195524421"]))