import java.io.*;

public class CF318A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        long n = Long.parseLong(split[0]);
        long k = Long.parseLong(split[1]);

        if(2*k <= n+1) pw.println(2*k - 1);
        else pw.println(2*(k - (n+1)/2));

        pw.close();
    }
}