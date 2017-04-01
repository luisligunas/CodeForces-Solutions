import java.io.*;

public class CF133A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String g = br.readLine();
        
        if(g.contains("H") || g.contains("Q") || g.contains("9"))
            pw.println("YES");
        else pw.println("NO");
        
        pw.close();
    }
}