import java.io.*;

public class CF734A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        br.readLine();
        String g = br.readLine();
        
        int anton = 0;
        for(int i = 0; i < g.length(); i++) {
            if(g.charAt(i) == 'A')
                anton++;
        }
        anton *= 2;
        
        if(anton == g.length()) pw.println("Friendship");
        else if(anton > g.length()) pw.println("Anton");
        else pw.println("Danik");
        
        pw.close();
    }
}