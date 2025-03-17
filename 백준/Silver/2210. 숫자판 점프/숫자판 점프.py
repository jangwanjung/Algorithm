import sys

def dfs(x,y,st):
    if len(st) == 6:
        st_list.append(st)
        return
    for i in range(4):
        px = x+dx[i]
        py = y+dy[i]
        if 0<=px<5 and 0<=py<5:
            dfs(px,py,st+arr[px][py])   

input = sys.stdin.readline
st_list = []
dx = [0,0,-1,1]
dy = [1,-1,0,0]
arr = []
for _ in range(5):
    arr.append(list(input().split()))

for i in range(5):
    for j in range(5):
        dfs(i,j,arr[i][j])

print(len(set(st_list)))