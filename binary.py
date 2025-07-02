n=int(input())
if n==0:
    print('0')
for i in range(1,n+1):
    b=""
    temp=i
    while temp:
        if temp%2==0:
            b+="0"
        else:
            b+='1'
        temp=temp//2    
    print(b)