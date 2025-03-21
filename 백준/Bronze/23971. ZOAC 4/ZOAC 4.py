h,w,n,m = map(int,input().split())

cnt = 0
for i in range(0,w,m+1):
    for j in range(0,h,n+1):
        cnt+=1

print(cnt)