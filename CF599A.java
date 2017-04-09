import java.io.*;

public class CF599A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int d1 = Integer.parseInt(split[0]);
        int d2 = Integer.parseInt(split[1]);
        int d3 = Integer.parseInt(split[2]);
        
        pw.println(Math.min(2 * Math.min(d1 + d2, Math.min(d1 + d3, d2 + d3)), d1 + d2 + d3));
        
        pw.close();
    }
}