import java.io.*;

public class CF707A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int rows = Integer.parseInt(br.readLine().split(" ")[0]);
        boolean colored = false;
        
        while(rows-- > 0) {
            String g = br.readLine();
            
            for(int i = 0; !colored && i < g.length(); i += 2) {
                if(g.charAt(i) == 'C' || g.charAt(i) == 'M' || g.charAt(i) == 'Y') {
                    colored = true;
                    break;
                }
            }
        }
        
        if(colored) pw.println("#Color");
        else pw.println("#Black&White");
        
        pw.close();
    }
}