import sys
import copy
def bruteforce(height):
    global time_min,height_max,b_copy 
    time = 0
    
    for i in range(n*m):
        if arr_copy[i] > height:
            b_copy += arr_copy[i]-height
            time += (arr_copy[i]-height)*2
            arr_copy[i] -= arr_copy[i]-height
        elif arr_copy[i] < height:
            b_copy -= height-arr_copy[i]
            if b_copy<0:
                return
            time += height-arr_copy[i]
            arr_copy[i] += height - arr_copy[i]
            
        
                        
    if time<=time_min:
        time_min = min(time_min,time)
        height_max = max(height_max,height)

            
input = sys.stdin.readline

n,m,b = map(int,input().split())

time_min = float("inf")
height_max = 0
arr = []
for i in range(n):
    arr.extend(map(int,input().split()))
arr.sort(reverse=True)    
for i in range(257):
    arr_copy = arr[:]
    b_copy = b
    bruteforce(i)

print(time_min,height_max)
