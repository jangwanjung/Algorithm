import math
n=int(input())
for i in range(n):
    x1,y1,r1,x2,y2,r2=map(int,input().split())
    l=math.sqrt((x1-x2)**2+(y1-y2)**2)
    if l==0 and r1==r2:
        print(-1)
    elif abs(r1-r2)==l or l==(r1+r2):
        print(1)
    elif abs(r1-r2)<l<(r1+r2):
        print(2)
    else:
        print(0)