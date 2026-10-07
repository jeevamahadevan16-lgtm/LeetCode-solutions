class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        boolean[] visited = new boolean[n];

        return dfs(source, destination, graph, visited);
    }

    boolean dfs(int u, int dest, ArrayList<Integer>[] graph, boolean[] visited) {
        if (u == dest)
            return true;

        visited[u] = true;

        for (int v : graph[u]) {
            if (!visited[v] && dfs(v, dest, graph, visited))
                return true;
        }

        return false;
    }
}