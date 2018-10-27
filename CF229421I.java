import java.util.*;
import java.io.*;

public class CF229421I {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	static int[][] dp; //charge, time
	static int[] opp; //num opponents on screen
	static int m; //time needed to charge
	
	public static void main(String[] args) throws Exception {
		String[] split = br.readLine().split(" ");
		
		m = Integer.parseInt(split[1]);
		
		split = br.readLine().split(" ");
		opp = new int[split.length];
		
		for(int i = 0; i < split.length; i++)
			opp[i] = Integer.parseInt(split[i]);
		
		dp = new int[m+1][300001];
		for(int i = 0; i < dp.length; i++)
			Arrays.fill(dp[i], -1);
		
		pw.println(dp(0, 0));
		
		pw.close();
	}
	
	public static int dp(int charge, int time) {
		if(time == opp.length - 1) {
			if(charge == m)
				return opp[time];
			return 0;
		}
		if(dp[charge][time] != -1)
			return dp[charge][time];
		
		if(charge == m) {
			dp[charge][time] = Math.max(dp(1, time + 1) + opp[time], dp(charge, time + 1));
			return dp[charge][time];
		}
		dp[charge][time] = dp(charge + 1, time + 1);
		return dp[charge][time];
	}
}
