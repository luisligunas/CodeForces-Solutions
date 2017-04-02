import java.io.*;

public class CF479A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        int ans = a + b + c;
        ans = Math.max(ans, a + b * c);
        ans = Math.max(ans, a * b + c);
        ans = Math.max(ans, a * b * c);
        ans = Math.max(ans, (a + b) * c);
        ans = Math.max(ans, a * (b + c));
        
        pw.println(ans);
        
        pw.close();
    }
}