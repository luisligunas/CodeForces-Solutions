import java.io.*;

public class CF459B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        
        int min = Integer.MAX_VALUE, max = -1;
        long maxCount = 0, minCount = 0;
        
        for(int i = 0; i < split.length; i++) {
            int num = Integer.parseInt(split[i]);
            
            if(num == min) minCount++;
            else if(num < min) minCount = 1;
            
            if(num == max) maxCount++;
            else if(num > max) maxCount = 1;
            
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        if(max != min) pw.println((max - min) + " " + (minCount * maxCount));
        else pw.println("0 " + (minCount*(minCount - 1)/2));
        
        pw.close();
    }
}