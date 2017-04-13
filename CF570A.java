import java.io.*;

public class CF570A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int[] numWins = new int[Integer.parseInt(split[0])];
        int numCities = Integer.parseInt(split[1]);
        
        while(numCities-- > 0) {
            split = br.readLine().split(" ");
            
            int max = -1, maxInd = -1;
            for(int i = 0; i < split.length; i++) {
                int votes = Integer.parseInt(split[i]);
                
                if(votes > max) {
                    max = votes;
                    maxInd = i;
                }
            }
            numWins[maxInd]++;
        }
        
        int max = -1, maxInd = -1;
        for(int i = 0; i < numWins.length; i++) {
            if(numWins[i] > max) {
                max = numWins[i];
                maxInd = i;
            }
        }
        
        pw.println(maxInd + 1);
        
        pw.close();
    }
}