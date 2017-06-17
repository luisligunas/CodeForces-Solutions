import java.io.*;
import java.util.*;

public class CF124B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static int k;
	static int[][] numbers;
	
	public static void main (String[] args) throws IOException {
		String[] split = br.readLine().split(" ");
		int n = Integer.parseInt(split[0]);
		k = Integer.parseInt(split[1]);
		
		numbers = new int[n][k];
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			for(int j = 0; j < k; j++) {
				numbers[i][j] = (num / (int) Math.pow(10, k - j - 1)) % 10;
			}
		}
		
		pw.println(recurse(0, new int[k], 0));
		
		pw.close();
	}
	public static int recurse(int bitmask, int[] sequence, int currInd) {
		if(currInd == k) return getDifference(sequence);
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < k; i++) {
			if(((bitmask >> i) & 1) == 0) {
				int newMask = bitmask | (1 << i);
				sequence[currInd] = i;
				
				min = Math.min(min, recurse(newMask, sequence, currInd + 1));
			}
		}
		return min;
	}
	public static int getDifference(int[] sequence) {
		int min = Integer.MAX_VALUE;
		int max = -1;
		
		for(int i = 0; i < numbers.length; i++) {
			int curr = 0;
			for(int j = 0; j < sequence.length; j++) {
				curr = curr*10 + numbers[i][sequence[j]];
			}
			min = Math.min(min, curr);
			max = Math.max(max, curr);
		}
		return max - min;
	}
}
