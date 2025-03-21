n,game = input().split()

man = -1
if game == "Y":
    man = 1
elif game == "F":
    man = 2
elif game =="O":
    man = 3

arr = []
for i in range(int(n)):
    arr.append(input())

arr_set = list(set(arr))

cnt = len(arr_set)//man

print(cnt)