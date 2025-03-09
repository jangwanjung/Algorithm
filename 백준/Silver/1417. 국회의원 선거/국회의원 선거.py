import sys

def check(ls):
    dasom = ls[0]
    maximum=0
    for i in range(1,len(ls)):
        maximum = max(maximum,ls[i])
    
    if dasom>maximum: return False
    else: return True

def maximum_index(ls):
    a = 0 
    for i in range(1,len(ls)):
        if ls[i]>a:
            a = ls[i]
            index = i
    return index

        
            
n = int(sys.stdin.readline())
ls = []
for i in range(n):
    ls.append(int(sys.stdin.readline()))

cnt = 0
while(check(ls)):
    max_index = maximum_index(ls)
    cnt+=1
    ls[max_index]-=1
    ls[0]+=1

print(cnt)       