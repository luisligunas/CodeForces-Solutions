import java.io.*;

public class CF698A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static int[] days;
	static int[][] dp;
	static boolean[][] visited;
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		days = new int[n];
		dp = new int[n][4];
		visited = new boolean[n][4];
		
		String[] split = br.readLine().split(" ");
		for(int i = 0; i < days.length; i++) {
			days[i] = Integer.parseInt(split[i]);
		}
		
		//g , c
		//0 - closed, closed
		//1 - closed, open
		//2 - open, closed
		//3 - open, open
		
		pw.println(recurse(0, 0));
		
		pw.close();
	}
	public static int recurse(int ind, int prev) {
		//prev:
		//0 - nothing
		//1 - gym
		//2 - code
		
		if(ind == days.length) return 0;
		if(visited[ind][prev]) return dp[ind][prev];
		visited[ind][prev] = true;
		
		int val = recurse(ind + 1, 0) + 1;
		if(days[ind] > 1) {
			if(prev != 1) {
				val = Math.min(recurse(ind + 1, 1), val);
			}
		}
		if(days[ind] % 2 == 1) {
			if(prev != 2) {
				val = Math.min(recurse(ind + 1, 2), val);
			}
		}
		dp[ind][prev] = val;
		return val;
	}
}