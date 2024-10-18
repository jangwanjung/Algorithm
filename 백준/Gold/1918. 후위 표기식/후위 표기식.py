#중위표기식을 후위표기식으로 변환하는코드
#1.숫자면 그냥 넣자
#2.'('가 나오면 그냥 스택에 넣자
#3.')'가 나오면 스택에서 (가 나올때까지 모든값을 빼자
#4.연산자가 나오면 자기보다 높거나 같은 우선순위를 가진 연산자를 모두빼고 그 후 스택에 본인을 넣자
#5.마지막에는 스택의 있는 모든값을 빼자
def change(expr):
    stack = []
    output = []
    for i in expr:
        if i in '(':
            stack.append(i)
        elif i in ')':
            while len(stack)!=0:
                a = stack.pop()
                if a=='(':
                    break
                else:
                    output.append(a)
        elif i in '+-*/':
            while len(stack)!=0:
                a = stack[-1]
                if check(i) <= check(a):
                    output.append(stack.pop())
                else:
                    break
            stack.append(i)
        else:
            output.append(i)
        
    while len(stack)!=0:
        output.append(stack.pop())
    
    return output

def check(i):
    if i=='(' or i==')':
        return 0
    elif i=='+' or i=='-':
        return 1
    elif i=='*' or i=='/':
        return 2

st = input()   
ls = change(st)
for i in ls:
    print(i,end="")