import java.io.*;
import java.util.*;

public class CF166E {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		
		long[][] matrix = new long[4][4];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(i == j) continue;
				matrix[i][j] = 1;
			}
		}
		
		long[][] runningMatrix = clone(matrix);
		long[][] runningAnswer = getIdentityMatrix();
		
		for(int i = 0; i < 25; i++) {
			if(i != 0) runningMatrix = multiplyMatrices(runningMatrix, runningMatrix);
			if((n & (1 << i)) == 0) continue;
			
			runningAnswer = multiplyMatrices(runningAnswer, runningMatrix);
		}
		
		if(n == 1) pw.println(0);
		else pw.println(runningAnswer[3][3]);
		
		pw.close();
	}
	
	public static long[][] getIdentityMatrix() {
		long[][] a = new long[4][4];
		
		for(int i = 0; i < a.length; i++) {
			a[i][i] = 1;
		}
		
		return a;
	}
	
	public static long[][] multiplyMatrices(long[][] a, long[][] b) {
		long[][] out = new long[a.length][a[0].length];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				for(int k = 0; k < a.length; k++) {
					out[i][j] += a[i][k]*b[k][j];
					out[i][j] %= 1000000007;
				}
			}
		}
		
		return out;
	}
	
	public static long[][] clone(long[][] a) {
		long[][] b = new long[a.length][];
		
		for(int i = 0; i < b.length; i++) {
			b[i] = a[i].clone();
		}
		return b;
	}
}
