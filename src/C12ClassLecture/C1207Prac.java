package C12ClassLecture;

public class C1207Prac {
    static int answer = 0;
    static int count = 0;

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        boolean[] visited = new boolean[dungeons.length];

        recur(dungeons, visited, k);
        System.out.println(answer);
    }

    static void recur(int[][] dungeons, boolean[] visited, int k) {
        if (answer < count) {
            answer = count;
        } else {
            for (int i = 0; i < dungeons.length; i++) {
                if (!visited[i] && (dungeons[i][0] <= k)) {
                    visited[i] = true;
                    k = k - dungeons[i][1];
                    count++;
                    recur(dungeons, visited, k);
                    visited[i] = false;
                    count--;
                    k = k + dungeons[i][1];
                }

            }
        }
    }
}