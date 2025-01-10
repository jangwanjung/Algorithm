n,m=map(int,input().split())
c1=[]
c2=[]
for i in range(n):
    b=[]
    for j in range(m):
        if (j+i)%2==0:
            b.append('B')
        else:
            b.append('W')
    c1.append(b)
for i in range(n):
    b=[]
    for j in range(m):
        if (j+i)%2==0:
            b.append('W')
        else:
            b.append('B')
    c2.append(b)
#제대로된 체스만 두개 생성완요
k=[]
for i in range(n):
    k.append(list(input()))

result1=[]
result2=[]

for i in range(n):
    p=[]
    for j in range(m):
        if k[i][j]!=c1[i][j]:
            p.append(1)
        else:
            p.append(0)
    result1.append(p)
for i in range(n):
    p=[]
    for j in range(m):
        if k[i][j]!=c2[i][j]:
            p.append(1)
        else:
            p.append(0)
    result2.append(p)

#체스판의 잘못된부분은 1로 이차원배열 완성
min1=10000000 
count=0
for i in range(n-7):
    for j in range(m-7):
        count=0
        for k in range(8):
            count+=sum(result1[k+i][j:j+8])
        min1=min(count,min1)
        
for i in range(n-7):
    for j in range(m-7):
        count=0
        for k in range(8):
            count+=sum(result2[k+i][j:j+8])
        min1=min(count,min1)
print(min1)
