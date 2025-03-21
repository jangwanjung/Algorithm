n = int(input())

arr = []

for i in range(n):
    arr.append(input())
pointer= 0

result = ""

while arr[pointer] != "KBS1":
    pointer+=1
    result+="1"

while arr[0] != "KBS1":
    temp = arr[pointer]
    arr[pointer] = arr[pointer-1]
    arr[pointer-1] = temp
    pointer -=1
    result+="4"
while arr[pointer] != "KBS2":
    pointer+=1
    result+="1"
while arr[1] != "KBS2":
    temp = arr[pointer]
    arr[pointer] = arr[pointer-1]
    arr[pointer-1] = temp
    pointer -=1
    result+="4"

print(result)
