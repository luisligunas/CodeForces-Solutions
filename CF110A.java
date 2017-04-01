import java.io.*;

public class CF110A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        
        String g = br.readLine();
        
        int count = 0;
        for(int i = 0; i < g.length(); i++) {
            if(g.charAt(i) == '4' || g.charAt(i) == '7')
                count++;
        }
        if(count == 4 || count == 7) pw.println("YES");
        else pw.println("NO");
        
        pw.close();
    }
}
