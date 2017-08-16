import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class CF617B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		br.readLine();
		String[] split = br.readLine().split(" ");
		ArrayList<Boolean> yarra = new ArrayList<Boolean>();
		
		for(int i = 0; i < split.length; i++) {
			yarra.add(split[i].equals("1"));
		}
		
		for(int i = 0; i < yarra.size(); i++) {
			if(yarra.get(i))
				break;
			yarra.remove(i);
			i--;
		}
		
		for(int i = yarra.size() - 1; i >= 0; i--) {
			if(yarra.get(i))
				break;
			yarra.remove(i);
		}
		
		if(yarra.size() <= 1) {
			System.out.println(yarra.size());
			return;
		}
		
		BigInteger ans = BigInteger.ONE;
		int left = 0;
		int right = 1;
		
		while(right < yarra.size()) {
			if(yarra.get(right)) {
				ans = ans.multiply(new BigInteger((right-left) + ""));
				
				left = right;
			}
			right++;
		}
		pw.println(ans);
		
		pw.close();
		
		
	}
}