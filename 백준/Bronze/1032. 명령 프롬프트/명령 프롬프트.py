import sys
input=sys.stdin.readline
n=int(input())
word=list(input())

for i in range(n-1):
    newword=list(input())
    for j in range(len(word)):
        if(word[j]!=newword[j]):
            word[j]='?'

for i in word:
    print(i,end="")

        