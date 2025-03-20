import sys
from collections import deque

def bfs(y,x):
    global flag
    queue = deque()
    queue.append((y,x))
    visited[y][x] = True
    while queue:
        y, x = queue.popleft()
        if y == n-1 :
            flag = True
            return
        for i in range(4):
            px = x + dx[i]
            py = y + dy[i]
            if 0<=px<m and 0<=py<n and visited[py][px] == False and arr[py][px]==0:
                queue.append((py,px))
                visited[py][px] = True
                
    
    

input = sys.stdin.readline

n,m = map(int ,input().split())
flag = False
arr = []
for i in range(n):
    arr.append(list(map(int,input().strip())))

dx = [1,-1,0,0]
dy = [0,0,1,-1]

visited = [[False]*m for _ in range(n)]
for i in range(m):
    if arr[0][i] == 0:
        bfs(0,i)

if flag:
    print("YES")
else:
    print("NO")
