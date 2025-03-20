import sys
from collections import deque

def bfs(x,y):
    global max_value
    visited = [[False]*m for _ in range(n)]
    queue = deque()
    queue.append((x,y,0))
    visited[x][y] = True
    

    while queue:
        px,py,depth = queue.popleft()
        visited[px][py] = True
        if arr[px][py] == 1:
            max_value = max(max_value,depth)
            return

        for i in range(8):
            kx = dx[i] + px
            ky = dy[i] + py
            if 0<=kx<n and 0<=ky<m and visited[kx][ky] == False:
                visited[kx][ky] = True
                queue.append((kx,ky,depth+1))

input = sys.stdin.readline

n,m = map(int,input().split())

max_value = -1
arr = []
for i in range(n):
    ls = list(map(int,input().split()))
    arr.append(ls)

dx = [1,-1,0,0,1,-1,1,-1]
dy = [0,0,1,-1,1,-1,-1,1]

for i in range(n):
    for j in range(m):
        if arr[i][j] == 0:
            bfs(i,j)

if max_value == float("inf"):
    print(0)
else:
    print(max_value)