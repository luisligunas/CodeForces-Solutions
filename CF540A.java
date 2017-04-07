import java.io.*;

public class CF540A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        br.readLine();
        char[] state = br.readLine().toCharArray();
        char[] key = br.readLine().toCharArray();
        
        int moves = 0;
        for(int i = 0; i < state.length; i++) {
            int distance = Math.abs(state[i] - key[i]);
            
            moves += Math.min(distance, 10 - distance);
        }
        pw.println(moves);
        
        pw.close();
    }
}