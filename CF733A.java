import java.io.*;

public class CF733A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        char[] string = br.readLine().toCharArray();
        int currJump = 0, maxJump = 0;
        
        for(int i = 0; i < string.length; i++) {
            if(string[i] == 'A' || string[i] == 'E' || string[i] == 'I' || string[i] == 'O' || string[i] == 'U' || string[i] == 'Y') {
                maxJump = Math.max(maxJump, currJump + 1);
                currJump = 0;
            }
            else currJump++;
        }
        maxJump = Math.max(maxJump, currJump + 1);
        
        pw.println(maxJump);
        
        pw.close();
    }
}