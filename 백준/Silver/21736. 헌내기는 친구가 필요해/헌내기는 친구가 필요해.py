import sys
sys.setrecursionlimit(10**6)
def findI():
    for i in range(n):
        for j in range(m):
            if arr[i][j] == "I":
                return (i,j)
def findX():
    for i in range(n):
        for j in range(m):
            if arr[i][j] == "X":
                visited[i][j] = True            

def dfs(x,y):
    global cnt
    visited[y][x] = True
    if arr[y][x] == "P":
        cnt+=1
    for i in range(4):
        
        px = x+dx[i]
        py = y+dy[i]
        if 0<=px<m and 0<=py<n and visited[py][px] == False:
            dfs(px,py)

            
n,m = map(int,input().split())

arr = []

cnt = 0
for _ in range(n):
    arr.append(list(input()))
visited = [[False]*m for _ in range(n)]

dx = [1,-1,0,0]
dy = [0,0,-1,1]
y,x = findI()
findX()
dfs(x,y)
if cnt == 0:
    print("TT")
else:
    print(cnt)