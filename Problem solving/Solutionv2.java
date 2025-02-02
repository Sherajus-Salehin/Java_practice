class Solutionv2 {
    int r, c;
    int[][] graph;
    boolean[][] visited;
    public int largestIsland(int[][] grid) {
        r = grid.length;
        c = grid[0].length;
        visited = new boolean[r][c];
        graph = grid;
        int Isize=0;
         visited=new boolean[r][c];
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            if (graph[i][j] != 0 && !visited[i][j]) {
                                Isize = Math.max(Isize, dfs(i, j));
                            } else if (graph[i][j]==0) {
                                graph[i][j]=1;
                                visited=new boolean[r][c];
                                Isize = Math.max(Isize, dfs(i, j));
                                graph[i][j]=0;
                            }
                        }
                    }
                    //main loop end

        return Isize;
    }

    int dfs(int x, int y) {
        if (x < 0 || x >= r || y < 0 || y >= c || visited[x][y] || graph[x][y] == 0) {
            return 0;
        }

//        for (int[] ints : graph) {
//            System.out.println();
//            for (int col = 0; col < graph[0].length; col++) {
//                System.out.print(ints[col]);
//            }
//        }
        visited[x][y] = true;
        int count = graph[x][y];

        // revise this
        count += dfs(x - 1, y); // Up
        count += dfs(x + 1, y); // Down
        count += dfs(x, y - 1); // Left
        count += dfs(x, y + 1); // Right
        //System.out.println("count"+count);
        return count;
    }
}
