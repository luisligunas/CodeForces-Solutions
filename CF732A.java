import java.io.*;

public class CF732A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int k = Integer.parseInt(split[0].substring(split[0].length() - 1));
        int r = Integer.parseInt(split[1]);
        
        int shovels = 1;
        int ones = k;
        
        while(true) {
            if(ones == r || ones == 0) break;
            
            ones = (ones + k) % 10;
            shovels++;
        }
        pw.println(shovels);
        
        pw.close();
    }
}