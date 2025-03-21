p = int(input())

for _ in range(p):
    arr = list(map(int,input().split()))
    cnt = 0

    for i in range(20,1,-1):
        for j in range(20,1,-1):
            if arr[j]<arr[j-1]:

                temp = arr[j]
                arr[j] = arr[j-1]
                arr[j-1] = temp
                cnt+=1

    print(arr[0],cnt)