import java.io.*;

public class CF432A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int k = Integer.parseInt(br.readLine().split(" ")[1]);
        String[] split = br.readLine().split(" ");
        int valid = 0;
        
        for(int i = 0; i < split.length; i++) {
            if(Integer.parseInt(split[i]) <= 5 - k)
                valid++;
        }
        
        pw.println(valid/3);
        
        pw.close();
    }
}