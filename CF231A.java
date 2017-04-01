import java.io.*;

public class CF231A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int tC = Integer.parseInt(br.readLine());
        String[] split;
        
        int answer = 0;
        for(int z = 0; z < tC; z++) {
            split = br.readLine().split(" ");
            
            int count = Integer.parseInt(split[0]) + Integer.parseInt(split[1]) + Integer.parseInt(split[2]);
            if(count > 1) answer++;
        }
        pw.println(answer);
        
        pw.close();
    }
}