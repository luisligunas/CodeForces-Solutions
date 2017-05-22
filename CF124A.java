import java.io.*;

public class CF124A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

	public static void main(String[] args) throws IOException {
		String[] split = br.readLine().split(" ");
		
		int n = Integer.parseInt(split[0]);
		int a = Integer.parseInt(split[1]);
		int b = Integer.parseInt(split[2]);
		
		pw.println(Math.min(n - a, b + 1));
	
		pw.close();
	}
}
