import java.io.*;

public class CF281A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String g = br.readLine();
        
        if(g.length() == 1) pw.println(g.toUpperCase());
        else pw.println(g.substring(0, 1).toUpperCase() + g.substring(1));
        
        pw.close();
    }
}