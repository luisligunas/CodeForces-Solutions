import java.util.*;
import java.io.*;

public class CF229421C {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	static long[][] dp = new long[1001][1001];
	static int[] timeTakes = new int[1001];
	static int[] moneyCost = new int[1001];
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
	static int n, m, t;
	static boolean trap = true;
	
	public static void main(String[] args) throws Exception {
		int x = Integer.parseInt(br.readLine());
		
		String[] split = br.readLine().split(" ");
		
		n = Integer.parseInt(split[0]);
		m = Integer.parseInt(split[1]);
		t = Integer.parseInt(split[2]);
		
		for(int i = 0; i < n + 1; i++)
			graph.add(new ArrayList<>());
		
		for(int i = 0; i < m; i++) {
			split = br.readLine().split(" ");
			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[1]);
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		
		for(int i = 0; i < n; i++) {
			split = br.readLine().split(" ");
			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[1]);
			timeTakes[i+1] = a;
			moneyCost[i+1] = b;
		}
		
		if(x < timeTakes[1]) {
			pw.println("It is a trap.");
			pw.close();
			return;
		}
		long ans = dp(1, x - timeTakes[1]) + moneyCost[1];
		
		if(trap)
			pw.println("It is a trap.");
		else
			pw.println(ans);
		
		pw.close();
	}
	
	public static long dp(int ride, int timeLeft) {
		if(timeLeft == 0 && ride == 1) {
			trap = false;
			return 0;
		}
		if(timeLeft <= 0)
			return -1;
		if(dp[ride][timeLeft] != 0)
			return dp[ride][timeLeft];
		
		
		long cost = Long.MAX_VALUE;
		
		ArrayList<Integer> adjRides = graph.get(ride);
		for(int i = 0; i < adjRides.size(); i++) {
			long thing = dp(adjRides.get(i), timeLeft - (timeTakes[adjRides.get(i)] + t));
			if(thing == -1)
				continue;
			cost = Math.min(cost, thing + moneyCost[adjRides.get(i)]);
		}
		
		long thing = dp(ride, timeLeft - timeTakes[ride]);
		if(thing != -1)
			cost = Math.min(cost, thing + moneyCost[ride]);
		
		if(cost == Long.MAX_VALUE)
			dp[ride][timeLeft] = -1;
		else
			dp[ride][timeLeft] = cost;
		
		return dp[ride][timeLeft];
	}
}
