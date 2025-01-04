n,m=map(int,input().split())
ls=[[0 for i in range(m)] for i in range(n)]
dic={0:0,1:0,2:0,3:0,4:0,5:0,6:0,7:0,8:0,9:0}
for i in range(n):
    a=list(map(int,input()))
    for j in range(m):
        dic[a[j]]+=1
        ls[i][j]=a[j]

length=0
width=0
anw=1
for i in dic:
    if dic[i]>=4:  ##만약4개이상이면
        for j in range(n):  
            for k in range(m):
                if ls[j][k]==i:   ##해당숫자찾기
                    for p in range(j+1,n):  
                        if ls[p][k]==i:     ##해당숫자와같은 숫자를 세로줄에서 찾기
                            length=p
                            for t in range(k+1,m):  ##해당숫자와같은 숫자를 가로줄에서 찾기
                                if ls[j][t]==i:
                                    width=t
        
                                    if(ls[length][width]==i and length-j==width-k and anw<(length-j+1)*(width-k+1)):
                                        anw=(length-j+1)*(width-k+1)
    

print(anw)