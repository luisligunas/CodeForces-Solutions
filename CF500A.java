import java.io.*;

public class CF500A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        int destination = Integer.parseInt(br.readLine().split(" ")[1]) - 1;
        String[] split = br.readLine().split(" ");
        int curr = 0;
        
        while(curr < split.length) {
            if(curr >= destination) break;
            
            curr += Integer.parseInt(split[curr]);
        }
        if(curr == destination) pw.println("YES");
        else pw.println("NO");
        
        pw.close();
    }
}