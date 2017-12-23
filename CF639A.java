import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class CF639A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int k = Integer.parseInt(split[1]);
        int q = Integer.parseInt(split[2]);
        
        split = br.readLine().split(" ");
        int[] closeness = new int[split.length];
        for(int i = 0; i < split.length; i++)
            closeness[i] = Integer.parseInt(split[i]);
        
        ArrayList<Friend> friends = new ArrayList<Friend>();
        
        for(int z = 0; z < q; z++) {
            split = br.readLine().split(" ");
            int ind = Integer.parseInt(split[1]); //1-indexed
            
            if(split[0].equals("1")) {
                Friend friend = new Friend(ind, closeness[ind - 1]);
                friends.add(friend);
                
                if(friends.size() > k) {
                    Collections.sort(friends);
                    friends.remove(friends.size() - 1);
                }
            }
            else {
                boolean found = false;
                for(int i = 0; i < friends.size(); i++) {
                    if(friends.get(i).ind == ind) {
                        found = true;
                        break;
                    }
                }
                if(found) pw.println("YES");
                else pw.println("NO");
            }
        }
        
        pw.close();
    }
    public static class Friend implements Comparable<Friend> {
        int ind, closeness;
        
        public Friend(int i, int c) {
            ind = i;
            closeness = c;
        }
        
        @Override
        public int compareTo(Friend f) {
            return f.closeness - closeness;
        }
        
    }
}
