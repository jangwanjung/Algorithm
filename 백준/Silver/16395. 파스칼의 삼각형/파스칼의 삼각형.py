n,k = map(int,input().split())

dp = [[0]*31 for _ in range(31)]


for i in range(1,31):
    for j in range(1,i+1):
        if j==1 or j==i:
            dp[i][j] = 1
        else:
            dp[i][j] =dp[i-1][j-1] + dp[i-1][j]
        
print(dp[n][k])