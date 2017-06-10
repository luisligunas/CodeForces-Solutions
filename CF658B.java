import java.io.*;
import java.util.*;

public class CF658B {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main (String[] args) throws IOException {
		String[] split = br.readLine().split(" ");
		
		int n =  Integer.parseInt(split[0]);
		int k =  Integer.parseInt(split[1]);
		int q =  Integer.parseInt(split[2]);
		
		split = br.readLine().split(" ");
		int[] closeness = new int[n];
		
		for(int i = 0; i < split.length; i++) {
			closeness[i] = Integer.parseInt(split[i]);
		}
		
		ArrayList<Friend> friends = new ArrayList<Friend>();
		
		for(int z = 0; z < q; z++) {
			split = br.readLine().split(" ");
			int id = Integer.parseInt(split[1]);
			
			if(split[0].equals("1")) {
				friends.add(new Friend(id, closeness[id - 1]));
				
				if(friends.size() > k) {
					Collections.sort(friends);
					friends.remove(k);
				}
			}
			else {
				boolean found = false;
				for(int i = 0; i < friends.size(); i++) {
					if(friends.get(i).id == id) {
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
		int id, closeness;
		
		public Friend(int i, int c) {
			id = i;
			closeness = c;
		}
		
		public int compareTo(Friend f) {
			return f.closeness - closeness;
		}
	}
}
