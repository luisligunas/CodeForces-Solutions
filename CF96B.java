import java.io.*;
import java.util.*;

public class CF96B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static long n;
	
	public static void main (String[] args) throws IOException {
		n = Long.parseLong(br.readLine());
		
		int i = 2;
		long answer = Long.MAX_VALUE;
		while(answer == Long.MAX_VALUE) {
			answer = recurse(new int[i]);
			i += 2;
		}
		pw.println(answer);
		
		pw.close();
	}
	public static long recurse(int[] sequence) {
		boolean done = true;
		for(int i = 0; i < sequence.length; i++) {
			if(sequence[i] == 0) {
				done = false;
				break;
			}
		}
		if(done) {
			long sln = getValue(sequence);
			if(sln < n) return Long.MAX_VALUE;
			return sln;
		}
		
		long min = Long.MAX_VALUE;
		for(int i = 0; i < sequence.length; i++) {
			if(sequence[i] == 0) {
				sequence[i] = 4;
				for(int j = 0; j < sequence.length; j++) {
					if(sequence[j] == 0) {
						sequence[j] = 7;
						min = Math.min(min, recurse(sequence));
						sequence[j] = 0;
					}
				}
				sequence[i] = 0;
			}
		}
		return min;
	}
	public static long getValue(int[] sequence) {
		long out = 0;
		for(int i = 0; i < sequence.length; i++) {
			out = out*10 + sequence[i];
		}
		return out;
	}
}
