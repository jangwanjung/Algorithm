n = int(input())
arr = list()


for i in range(n):
    st = list(input())
    arr.append(st)

width = 0
length = 0
for i in range(n):
    cnt =  0
    for j in range(n):
        if arr[i][j] == ".":
            cnt+=1
        if (arr[i][j] == "X" and cnt>=2) or (j==n-1 and cnt>=2):
            width+=1
            cnt=0
        elif arr[i][j] == "X":
            cnt=0

for i in range(n):
    cnt =  0
    for j in range(n):
        if arr[j][i] == ".":
            cnt+=1
        if (arr[j][i] == "X" and cnt>=2) or (j==n-1 and cnt>=2):
            length+=1
            cnt=0
        elif arr[j][i] == "X":
            cnt=0

print(f"{width} {length}")