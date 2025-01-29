class Solution {
    int r, c;
    int[][] graph;
    boolean[][] visited;
    public int findMaxFish(int[][] grid) {
        r = grid.length;
        c = grid[0].length;
        visited = new boolean[r][c];
        graph = grid;
        int maxFish = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (graph[i][j] != 0 && !visited[i][j]) {
                    maxFish = Math.max(maxFish, dfs(i, j));
                }
            }
        }
        return maxFish;
    }

    int dfs(int x, int y) {
        if (x < 0 || x >= r || y < 0 || y >= c || visited[x][y] || graph[x][y] == 0) {
            return 0;
        }
        visited[x][y] = true;
        int fishCount = graph[x][y];

        // revise this
        fishCount += dfs(x - 1, y); // Up
        fishCount += dfs(x + 1, y); // Down
        fishCount += dfs(x, y - 1); // Left
        fishCount += dfs(x, y + 1); // Right

        return fishCount;
    }
}
