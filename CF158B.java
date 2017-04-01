import java.io.*;

public class CF158B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int[] yarra = new int[4];
        
        br.readLine();
        String[] split = br.readLine().split(" ");
        
        for(int i = 0; i < split.length; i++) {
            yarra[Integer.parseInt(split[i]) - 1]++;
        }
        //one and three combinations
        int count = Math.min(yarra[0], yarra[2]);
        yarra[0] -= count;
        yarra[2] -= count;
        
        //number of individual fours and threes
        count += yarra[3] + yarra[2];
        
        //one and two combinations
        count += Math.ceil((yarra[0] + 2*yarra[1])/4.0);
        
        pw.println(count);
        pw.close();
    }
}