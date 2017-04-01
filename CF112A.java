import java.io.*;

public class CF112A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String a = br.readLine().toLowerCase();
        String b = br.readLine().toLowerCase();
        
        int ans = a.compareTo(b);
        
        if(ans > 0) ans = 1;
        else if(ans < 0) ans = -1;
        pw.println(ans);
        
        pw.close();
    }
}