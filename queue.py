qsize=int(input())
s=[]
command=list(map(str,input().split(', ')))
value=list(map(str,input().split(', ')))
for i in range(len(command)):
    if command[i]=='add':
        if len(s)<qsize:
            s.append(value[i])
        else:
            print('Queue is full')

    elif command[i]=='pop':
        s.pop()
    elif command[i]=='size':
        print(len(s))
    elif command[i]=='print':
        for j in range(len(s)+1):
            print(s)
        


# qsize=int(input())
# s=[]
# command=list(map(str,input().split(', ')))
# value=list(map(str,input().split(', ')))
# for i in range(len(command)):
#     if command[i]=='add':
#         if len(s)<qsize:
#             s.append(value[i])
#         else:
#             print('queue is full')
#     elif command[i]=='pop':
#         s.pop()
#     elif command[i]=='size':
#         print(len(s))
#     elif command[i]=='print':
#         for j in range(len(s)+1):
#             print(s)










