import java.io.*;

public class CF58A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String g = br.readLine();
        String hello = "hello";
        
        int ind = 0;
        for(int i = 0; i < g.length(); i++) {
            if(g.charAt(i) == hello.charAt(ind)) ind++;
            if(ind == hello.length()) break;
        }
        if(ind == hello.length()) pw.println("YES");
        else pw.println("NO");
        
        pw.close();
    }
}
