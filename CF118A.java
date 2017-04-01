import java.io.*;

public class CF118A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        
        String g = br.readLine().toLowerCase();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < g.length(); i++) {
            char c = g.charAt(i);
            
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') continue;
            sb.append("." + c);
        }
        
        pw.println(sb);
        
        pw.close();
    }
}