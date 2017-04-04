import java.io.*;

public class CF59A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String word = br.readLine();
        String lower = word.toLowerCase();
        
        int numLower = 0;
        for(int i = 0; i < word.length(); i++) {
            if(lower.charAt(i) == word.charAt(i)) numLower++;
        }
        
        if(2*numLower >= word.length()) pw.println(lower);
        else pw.println(word.toUpperCase());
        
        pw.close();
    }
}