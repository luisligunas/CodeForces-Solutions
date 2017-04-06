import java.io.*;

public class CF584A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int t = Integer.parseInt(split[1]);
        
        if(n == 1 && t == 10) pw.println(-1);
        else {
            if(t == 10) n--;
            pw.print(t);
            for(int i = 1; i < n; i++) pw.print(0);
            pw.println();
        }
        
        pw.close();
    }
}