def dfs_recursive(graph, node):
    visited.add(node)
    print(node, end=" ")
    for neighbor in graph[node]:
        if neighbor not in visited:
            dfs_recursive(graph, neighbor)
graph = {
    1: [2, 3],
    2: [1, 3, 5],
    3: [1, 2, 4],
    4: [3, 5],
    5: [2, 4]
}
visited = set()
print("DFS:")
dfs_recursive(graph, 1)
