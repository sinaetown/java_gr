import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_15650 {
    static boolean[] visited;
    static int[] permut;

    static List<int[]> l;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        l = new ArrayList<>();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n];
        permut = new int[m];

        recur(0);
    }
    
    public static void recur(int a) {
        for (int i = a + 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                l.add(new int[]{i, j});
            }
        }
    }
}
