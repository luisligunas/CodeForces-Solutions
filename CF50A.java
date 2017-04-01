import java.io.*;

public class CF50A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        
        int m = Integer.parseInt(split[0]);
        int n = Integer.parseInt(split[1]);
        
        pw.println(m*n/2);
        
        pw.close();
    }
}