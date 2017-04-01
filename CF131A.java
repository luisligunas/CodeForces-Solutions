import java.io.*;

public class CF131A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String g = br.readLine();
        
        if(g.equals(g.toUpperCase())) pw.println(g.toLowerCase());
        else if(g.length() == 1) pw.println(g.toUpperCase());
        else {
            String first = g.substring(0, 1);
            String end = g.substring(1);
            
            if(first.equals(first.toLowerCase()) && end.equals(end.toUpperCase()))
                pw.println(first.toUpperCase() + end.toLowerCase());
            else pw.println(g);
        }
        
        pw.close();
    }
}