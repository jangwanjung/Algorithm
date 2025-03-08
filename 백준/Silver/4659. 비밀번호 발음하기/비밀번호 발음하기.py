while(True):
    
    st = input()


    if st == "end" : break
    cnt = 0

    if not any(char in st for char in "aeiou"):
        cnt+=1
        
    e = None
    모음 = 0
    자음 = 0
    for i in range(len(st)):
        if any(char in st[i] for char in "aeiou") :
            모음+=1
            자음=0
        elif not e == None:
            자음+=1 
            모음=0
        else :
            e = st[i]
            if any(char in e for char in "aeiou"):
                모음+=1
                자음=0
            else:
                자음+=1
                모음=0
        if 모음>=3 or 자음>=3 : 
            cnt+=1
            break

    for i in range(len(st)-1):
        if st[i] == st[i+1]:
            if any(char in st[i] for char in "eo"):
                continue
            else:
                cnt+=1
                break
    
    if cnt == 0 :
        print(f"<{st}> is acceptable.")
    else:
        print(f"<{st}> is not acceptable.")
