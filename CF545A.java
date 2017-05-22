import java.io.*;
import java.util.*;

public class CF545A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		String[] split;
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> good = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			split = br.readLine().split(" ");
			
			boolean isGood = true;
			for(int j = 0; j < split.length; j++) {
				int num = Integer.parseInt(split[j]);
				
				if(num % 2 == 1) {
					isGood = false;
					break;
				}
			}
			if(isGood) good.add(i + 1);
		}
		
		pw.println(good.size());
		for(int i = 0; i < good.size(); i++) {
			if(i != 0) pw.print(" ");
			pw.print(good.get(i));
			
			if(i == good.size() - 1) pw.println();
		}
		
		pw.close();
	}
}
