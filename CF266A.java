import java.io.*;

public class CF266A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        br.readLine();
        String stones = br.readLine();
        
        int count = 0;
        char prev = stones.charAt(0);
        
        for(int i = 1; i < stones.length(); i++) {
            char stone = stones.charAt(i);
            
            if(stone == prev) count++;
            else prev = stone;
        }
        
        pw.println(count);
        
        pw.close();
    }
}