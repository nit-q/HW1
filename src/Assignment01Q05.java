public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }

        int numVertices = m.length;
        int[] queue = new int[numVertices];
        int head = 0;
        int tail = 0;
        boolean[] visited = new boolean[numVertices];
        int[] distance = new int[numVertices];

        queue[tail] = i;
        tail++;
        visited[i] = true;
        distance[i] = 0;

        while (head < tail) {
            int current = queue[head];
            head++;

            for (int neighbor = 0; neighbor < numVertices; neighbor++) {
                if (m[current][neighbor] == 1 && !visited[neighbor]) {
                    visited[neighbor] = true;
                    distance[neighbor] = distance[current] + 1;

                    if (neighbor == j) {
                        return distance[neighbor];
                    }

                    queue[tail] = neighbor;
                    tail++;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}