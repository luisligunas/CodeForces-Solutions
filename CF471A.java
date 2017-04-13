import java.io.*;
import java.util.Arrays;

public class CF471A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String[] sticks = br.readLine().split(" ");
        Arrays.sort(sticks);
        String ans;
        
        if(sticks[0].equals(sticks[3])) {
            if(sticks[4].equals(sticks[5])) ans = "Elephant";
            else ans = "Bear";
        }
        else if(sticks[1].equals(sticks[4])) ans = "Bear";
        else if(sticks[2].equals(sticks[5])) {
            if(sticks[0].equals(sticks[1])) ans = "Elephant";
            else ans = "Bear";
        }
        else ans = "Alien";
        
        pw.println(ans);
        
        pw.close();
    }
}