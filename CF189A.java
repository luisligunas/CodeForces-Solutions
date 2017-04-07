import java.io.*;
import java.util.Arrays;

public class CF189A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static int[] cuts;
    static int[][] dp;
    
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        
        cuts = new int[split.length - 1];
        dp = new int[n + 1][split.length];
        
        for(int i = 1; i < split.length; i++) {
            cuts[i-1] = Integer.parseInt(split[i]);
        }
        Arrays.sort(cuts);
        
        int max = -1;
        for(int i = 0; i < cuts.length; i++) {
            max = Math.max(max, recurse(n, i));
        }
        pw.println(max);
        
        pw.close();
    }

    public static int recurse(int n, int ind) {
        if(n < 0) return -dp.length;
        if(dp[n][ind] != 0) return dp[n][ind];
        if(n % cuts[ind] == 0) return n/cuts[ind];
        
        int max = recurse(n - cuts[ind], ind) + 1;
        if(ind + 1 != cuts.length)
            max = Math.max(max, recurse(n, ind + 1));
        dp[n][ind] = max;
        
        return dp[n][ind];
    }
}