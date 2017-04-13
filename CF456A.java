import java.io.*;

public class CF456A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        int numLaptops = Integer.parseInt(br.readLine());
        String[] split;
        int[] price = new int[numLaptops]; //quality is index
        
        for(int i = 0; i < price.length; i++) {
            split = br.readLine().split(" ");
            
            price[Integer.parseInt(split[1]) - 1] = Integer.parseInt(split[0]);
        }
        
        boolean happy = false;
        for(int i = 1; i < price.length; i++) {
            if(price[i-1] > price[i]) {
                happy = true;
                break;
            }
        }
        
        if(happy) pw.println("Happy Alex");
        else pw.println("Poor Alex");
        
        pw.close();
    }
}