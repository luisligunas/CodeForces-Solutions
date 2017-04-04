import java.io.*;
import java.util.Arrays;

public class CF230A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int s = Integer.parseInt(split[0]);
        int n = Integer.parseInt(split[1]);
        
        Dragon[] dragons = new Dragon[n];
        for(int i = 0; i < dragons.length; i++) {
            split = br.readLine().split(" ");
            dragons[i] = new Dragon(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        }
        Arrays.sort(dragons);
        
        boolean hasLost = false;
        for(int i = 0; i < dragons.length; i++) {
            if(s <= dragons[i].strength) {
                hasLost = true;
                break;
            }
            s += dragons[i].bonus;
        }
        if(hasLost) pw.println("NO");
        else pw.println("YES");
        
        pw.close();
    }
    public static class Dragon implements Comparable<Dragon> {
        int strength, bonus;
        
        public Dragon(int s, int b) {
            strength = s;
            bonus = b;
        }

        @Override
        public int compareTo(Dragon o) {
            return strength - o.strength;
        }
    }
}