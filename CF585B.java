import java.util.*;
import java.io.*;

public class CF585B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static char TRAIN = 'T', EMPTY = '.', PERSON = 's';
	static char[][] yarra;
	static boolean[][] dp;
	
	public static void main(String[] args) throws IOException {
		
		int tC = Integer.parseInt(br.readLine());
		
		
		for(int z = 0; z < tC; z++) {
			yarra = new char[3][Integer.parseInt(br.readLine().split("\\s+")[0]) + 5];
			dp = new boolean[3][yarra[0].length];
			
			Queue<Point> positions = new LinkedList<>();
			
			for(int i = 0; i < yarra.length; i++) {
				String g = br.readLine();
				for(int j = 0; j < g.length(); j++) {
					if(g.charAt(j) == PERSON) positions.add(new Point(i, 0));
					else if(g.charAt(j) != EMPTY) yarra[i][j + 2] = TRAIN;
				}
			}
			
			boolean done = false;
			while(!positions.isEmpty()) {
				Point p = positions.remove();
				
				
				if(isDone(p)) {
					done = true;
					break;
				}
				if(!isValid(p) || hitTrain(p)) continue;
				if(dp[p.x][p.y]) continue;
				dp[p.x][p.y] = true;
				
				
				boolean gotHit = false;
				for(int i = 0; i < 3; i++) {
					p.y++;
					if(isDone(p)) {
						done = true;
						break;
					}
					if(hitTrain(p)) {
						gotHit = true;
						break;
					}
				}
				if(gotHit) continue;
				if(done) break;
				
				if(p.x != 0) positions.add(new Point(p.x - 1, p.y));
				if(p.x != 2) positions.add(new Point(p.x + 1, p.y));
				positions.add(p);
			}
			if(done) pw.println("YES");
			else pw.println("NO");
			
		}
		
		pw.close();
	}
	public static boolean hitTrain(Point p) {
		return yarra[p.x][p.y] == TRAIN;
	}
	public static boolean isValid(Point p) {
		//return p.x >= 0 && p.x < 3 && p.y >= 0 && p.y < yarra[0].length;
		return p.y < yarra[0].length;
	}
	public static boolean isDone(Point p) {
		return p.y >= yarra[0].length - 3;
		
	}
	public static class Point {
		int x, y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}