from collections import deque
import sys
input=sys.stdin.readline

n=int(input())

arr=[list(map(int,input().split())) for _ in range(n)]
a=sys.maxsize
result=[[a for _ in range(3)] for _ in range(n)]

for i in range(3):
    result[0][i]=arr[0][i]

for i in range(1,n):
    for j in range(3):
        for k in range(3):
            if j!=k:
                p=result[i-1][j]+arr[i][k]
                result[i][k]=min(p,result[i][k])

print(min(result[n-1]))