import java.util.*;

public class CF538A {
	public static void main(String[] args) {
		Scanner rennacS = new Scanner(System.in);
		
		String h = rennacS.nextLine();
		
		if(h.length() < 10) System.out.println("NO");
		else {
			String base = "CODEFORCES";
			String c = h.substring(0, 10);
			int stoppedAt = -1;
			
			for(int i = 0; i < 10; i++) {
				if(c.charAt(i) != base.charAt(i)) break;
				stoppedAt = i;
			}
			
			if(stoppedAt == 9) System.out.println("YES");
			else {
				c = h.substring(h.length() - 9 + stoppedAt);
				
				if(c.equals("CODEFORCES".substring(stoppedAt + 1))) System.out.println("YES");
				else System.out.println("NO");
			}
		}
	}
}