import java.io.*;
import java.util.*;

public class CF114B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		String[] split = br.readLine().split(" ");
		
		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		
		ArrayList<String> names = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			
			map.put(s, i);
			names.add(s);
		}
		
		Pair[] pairs = new Pair[m];
		
		for(int i = 0; i < m; i++) {
			split = br.readLine().split(" ");
			
			pairs[i] = new Pair(map.get(split[0]), map.get(split[1]));
		}
		
		int best = 0, bestCount = 0;
		
		for(int i = 0; i <= (1 << (n + 1)) - 1; i++) {
			int count = 0;
			
			for(int j = 0; j < pairs.length; j++) {
				if(((i >> pairs[j].x) & 1) == 1 && ((i >> pairs[j].y) & 1) == 1) {
					count = -1;
					break;
				}
			}
			
			if(count == -1) continue;
			for(int j = 0; j < n; j++) {
				if(((i >> j) & 1) == 1)
					count++;
			}
			
			if(count > bestCount) {
				bestCount = count;
				best = i;
			}
		}
		
		ArrayList<String> answers = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			if(((best >> i) & 1) == 1)
				answers.add(names.get(i));
		}
		Collections.sort(answers);
		
		pw.println(bestCount);
		for(String s : answers) {
			pw.println(s);
		}
		
		pw.close();
	}
	
	public static class Pair {
		int x, y;
		
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
