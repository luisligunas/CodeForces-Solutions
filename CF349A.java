import java.io.*;

public class CF349A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        int twentyFive = 0, fifty = 0;
        boolean possible = true;
        
        for(int i = 0; i < split.length; i++) {
            if(split[i].equals("25")) twentyFive++;
            else if(split[i].equals("50")) {
                if(twentyFive == 0) {
                    possible = false;
                    break;
                }
                fifty++;
                twentyFive--;
            }
            else {
                if(fifty >= 1 && twentyFive >= 1) {
                    fifty--;
                    twentyFive--;
                }
                else if(twentyFive >= 3) twentyFive -= 3;
                else {
                    possible = false;
                    break;
                }
            }
        }
        
        if(possible) pw.println("YES");
        else pw.println("NO");
        
        pw.close();
    }
}