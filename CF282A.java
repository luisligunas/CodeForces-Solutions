import java.io.*;

public class CF282A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int tC = Integer.parseInt(br.readLine());
        int out = 0;
        
        for(int z = 0; z < tC; z++) {
            String g = br.readLine();
            
            if(g.charAt(0) == '+' || g.charAt(2) == '+') out++;
            else out--;
        }
        pw.println(out);
            
        
        pw.close();
    }
}