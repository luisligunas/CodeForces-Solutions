import java.io.*;

public class CF509A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[][] yarra = new int[n][n];
        
        for(int i = 0; i < yarra.length; i++) {
            yarra[i][0] = 1;
            yarra[0][i] = 1;
        }
        
        for(int i = 1; i < yarra.length; i++) {
            for(int j = 1; j < yarra.length; j++) {
                yarra[i][j] = yarra[i-1][j] + yarra[i][j-1];
            }
        }
        
        pw.println(yarra[n-1][n-1]);
        
        pw.close();
    }
}