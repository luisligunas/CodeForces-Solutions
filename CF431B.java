import java.io.*;
import java.util.*;

public class CF431B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static int[][] happiness;
	
	public static void main (String[] args) throws IOException {
		happiness = new int[5][5];
		String[] split;
		
		for(int i = 0; i < 5; i++) {
			split = br.readLine().split(" ");
			for(int j = 0; j < 5; j++) {
				happiness[i][j] = Integer.parseInt(split[j]);
			}
		}
		
		pw.println(recurse(0, new int[5], 0));
		
		pw.close();
	}
	public static int recurse(int bitmask, int[] sequence, int currInd) {
		if(currInd == 5) return getHappiness(sequence);
		
		int max = 0;
		for(int i = 0; i < 5; i++) {
			if(((bitmask >> i) & 1) == 0) {
				int newMask = bitmask | (1 << i);
				sequence[currInd] = i;
				
				max = Math.max(max, recurse(newMask, sequence, currInd + 1));
			}
		}
		return max;
	}
	public static int getHappiness(int[] sequence) {
		int out = 0;
		
		for(int i = 0; i < 4; i++) {
			for(int j = i; j < 4; j += 2) {
				out += happiness[sequence[j]][sequence[j+1]] + happiness[sequence[j+1]][sequence[j]];
			}
		}
		return out;
	}
}
