import java.io.*;

public class CF427A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        int total = 0, untreated = 0;
        
        for(int i = 0; i < split.length; i++) {
            int num = Integer.parseInt(split[i]);
            
            if(num == -1) {
                total--;
                if(total < 0) {
                    total = 0;
                    untreated++;
                }
            }
            else total += num;
        }
        pw.println(untreated);
        
        pw.close();
    }
}