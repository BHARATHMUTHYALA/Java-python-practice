# # # n, e = map(int, input().split()) 
# # # adj_list=[[] for _ in range(n+1)  ]
# # # for _ in range(e):
# # #     u,v=map(int,input().split())
# # #     adj_list[u].append(v)
# # #     adj_list[v].append(u)
# # # visited=[False *(n+1)]
# # # connected_components=0

# # # for node in range(1,n+1):
# # #     if not visited[node]:
# # #         stack=[node]
# # #         while stack:
# # #             curt_node=stack.pop()
# # #             visited[curt_node]=True
# # #             for neighbour in adj_list[curt_node]:
# # #                 if not visited(neighbour):
# # #                     stack.append(neighbour)
# # #         connected_components+=1

# # # print( connected_components)

# n,e=map(int,input().split())
# adj_list=[[] for _ in range(n+1)]
# for _ in range(e):
#     u,v=map(int,input().split())
#     adj_list[u].append(v)
#     adj_list[v].append(u)

# visited=[False]*(n+1)
# connected_comps=0

# for node in range(1,n+1):
#     if not visited[node]:
#         stack=[node]
#         while stack:
#             curt_node=stack.pop()
#             visited[curt_node]=True
#             for neighbour in adj_list[curt_node]:
#                 if not visited[neighbour]:
#                     stack.append(neighbour)
#         connected_comps+=1

# print(connected_comps)


n, e = map(int, input().split())  # Number of nodes and edges
adj_list = [[] for _ in range(n + 1)]  # Adjacency list
for _ in range(e):
    u, v = map(int, input().split())
    adj_list[u].append(v)
    adj_list[v].append(u)

visited = [False] * (n + 1)  # Array to track visited nodes
concted_compnts = 0

# Depth First Search (DFS) to count connected components
for node in range(1, n + 1):
    if not visited[node]:
        stack = [node]
        while stack:
            curt_node = stack.pop()
            visited[curt_node] = True
            for neighbor in adj_list[curt_node]:
                if not visited[neighbor]:
                    stack.append(neighbor)
        concted_compnts += 1

# Output
print(concted_compnts)
