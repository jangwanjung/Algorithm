ls = [0] * 26
st = input()

for i in st:
    ls[ord(i)-97]+=1

for i in ls:
    print(i,end=" ")