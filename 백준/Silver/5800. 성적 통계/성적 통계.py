
k = int(input())

cl = 0
for i in range(k):
    cl+=1
    ls = list(map(int,input().split()))
    num = ls[0]
    del ls[0]
    max_score = max(ls)
    min_score = min(ls)
    max_score_gap = 0 
    ls.sort(reverse=True)
    for j in range(len(ls)-1):
        gap = abs(ls[j]-ls[j+1])
        if gap>max_score_gap:
            max_score_gap = gap

    print("Class",cl)
    print(f"Max {max_score}, Min {min_score}, Largest gap {max_score_gap}")