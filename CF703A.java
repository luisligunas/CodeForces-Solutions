import java.io.*;

public class CF703A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int numRounds = Integer.parseInt(br.readLine());
        int mishka = 0, chris = 0;
        
        while(numRounds-- > 0) {
            String g = br.readLine();
            int m = Integer.parseInt(g.substring(0, 1));
            int c = Integer.parseInt(g.substring(2));
            
            if(m > c) mishka++;
            else if(m < c) chris++;
        }
        
        if(mishka > chris) pw.println("Mishka");
        else if(mishka < chris) pw.println("Chris");
        else pw.println("Friendship is magic!^^");
        
        pw.close();
    }
}