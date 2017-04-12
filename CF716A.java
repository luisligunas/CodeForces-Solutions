import java.io.*;

public class CF716A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int c = Integer.parseInt(split[1]);
        
        split = br.readLine().split(" ");
        int words = 1, prev = Integer.parseInt(split[0]);
        
        for(int i = 1; i < split.length; i++) {
            int curr = Integer.parseInt(split[i]);
            
            if(curr - prev > c) words = 1;
            else words ++;
            
            prev = curr;
        }
        
        pw.println(words);
        
        pw.close();
    }
}