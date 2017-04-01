import java.io.*;

public class CF71A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int tC = Integer.parseInt(br.readLine());
        
        for(int z = 0; z < tC; z++) {
            String g = br.readLine();
            
            if(g.length() > 10)
                g = g.charAt(0) + Integer.toString(g.length() - 2) + g.charAt(g.length() - 1);
            
            pw.println(g);
        }
        
        
        pw.close();
    }
}