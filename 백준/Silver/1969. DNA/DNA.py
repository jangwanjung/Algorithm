n,m = map(int,input().split())

ls = []
for i in range(n):
    ls.append(input())

arr = [[0]*26 for _ in range(m)]

for i in ls:
    cnt = 0 
    for j in range(m):
    
        arr[j][ord(i[cnt])-65]+=1
        cnt+=1

result = []
count = 0
for i in range(m):
    #각자리수 확인인
    max_index = arr[i].index(max(arr[i]))
    result.append(chr(max_index+65))
    count += sum(arr[i])-max(arr[i])
    

print("".join(result))
print(count)