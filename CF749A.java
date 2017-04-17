import java.io.*;

public class CF749A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		int num = Integer.parseInt(br.readLine());
		
		pw.println(num/2);
		pw.print((num%2) + 2);
		
		while(num > 3) {
			pw.print(" 2");
			num -= 2;
		}
		pw.println();
		
		pw.close();
	}
}