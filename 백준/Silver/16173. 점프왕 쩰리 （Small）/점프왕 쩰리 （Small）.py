import sys
sys.setrecursionlimit(10**5)
def dfs(x,y):
    global flag
    if x<n and y<n: 
        num = arr[x][y]
        if num == 0:
            return
    else:
        return
     
    if x==n-1 and y==n-1:
        flag = True
        return
    else:
        dfs(x+num,y)
        dfs(x,y+num)

        

n = int(input())
arr = []
flag = False

for i in range(n):
    ls = list(map(int,input().split()))
    arr.append(ls)

dfs(0,0)
if flag:
    print("HaruHaru")
else:
    print("Hing")
