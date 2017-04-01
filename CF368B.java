import java.io.*;
import java.util.*;

public class CF368B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static int[] answers, yarra;
	
	public static void main(String[] args) throws IOException {
		String[] split = br.readLine().split(" ");
		
		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		
		answers = new int[n];
		yarra = new int[n];
		
		split = br.readLine().split(" ");
		for(int i = 0; i < yarra.length; i++) {
			yarra[i] = Integer.parseInt(split[i]);
		}
		fillArray();
		
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(br.readLine()) - 1;
			pw.println(answers[num]);
		}
		
		pw.close();
	}
	public static void fillArray() {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = answers.length - 1; i >= 0; i--) {
			set.add(yarra[i]);
			answers[i] = set.size();
		}
	}
}