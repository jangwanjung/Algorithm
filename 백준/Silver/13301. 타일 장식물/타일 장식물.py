n = int(input())

dp = [0]*81
dp[1]=1
dp[2]=1
for i in range(2,81):
    dp[i] = dp[i-1]+dp[i-2]         

print(dp[n]*4+dp[n-1]*2)