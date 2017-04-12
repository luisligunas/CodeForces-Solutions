import java.io.*;

public class CF467B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        
        int k = Integer.parseInt(split[2]);
        int[] players = new int[Integer.parseInt(split[1])];
        
        for(int i = 0; i < players.length; i++)
            players[i] = Integer.parseInt(br.readLine());
        
        int fedor = Integer.parseInt(br.readLine());
        int friends = 0;
        
        for(int i = 0; i < players.length; i++) {
            if(Integer.bitCount(players[i] ^ fedor) <= k)
                friends++;
        }
        pw.println(friends);
        
        pw.close();
    }
}