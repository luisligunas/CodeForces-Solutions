import java.io.*;

public class CF567A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        
        int[] cities = new int[split.length];
        
        for(int i = 0; i < cities.length; i++)
            cities[i] = Integer.parseInt(split[i]);
        
        for(int i = 0; i < cities.length; i++) {
            int min = 0, max = 0;
            
            if(i == 0) {
                min = cities[1] - cities[0];
                max = cities[cities.length - 1] - cities[0];
            }
            else if(i == cities.length - 1) {
                min = cities[cities.length - 1] - cities[cities.length - 2];
                max = cities[cities.length - 1] - cities[0];
            }
            else {
                min = Math.min(cities[i] - cities[i - 1], cities[i + 1] - cities[i]);
                max = Math.max(cities[cities.length - 1] - cities[i], cities[i] - cities[0]);
            }
            
            pw.println(min + " " + max);
        }
        
        pw.close();
    }
}