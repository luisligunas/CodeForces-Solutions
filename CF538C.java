import java.util.Scanner;

public class CF538C {
	public static void main(String[] args) {
		Scanner rennacS = new Scanner(System.in);
		
		int days = rennacS.nextInt();
		int notes = rennacS.nextInt();
		
		int nthNote = rennacS.nextInt();
		int nthHeight = rennacS.nextInt();
		
		long max = nthHeight + (nthNote - 1);
	
		boolean fedUp = false;
		boolean end = false;
		for(int i = 1; i < notes; i++) {
			int ind = rennacS.nextInt();
			int height = rennacS.nextInt();
			if(ind == days) end = true;
			
			int temp = ind - nthNote;
			int temp2 = Math.abs(height - nthHeight);
			if(temp < temp2) {
				fedUp = true;
				break;
			}
			int roundDown = (temp - temp2)/2;
			if(Math.max(height, nthHeight) + roundDown > max) max = Math.max(height, nthHeight) + roundDown;
			nthNote = ind;
			nthHeight = height;
		}
		
		if(fedUp) System.out.println("IMPOSSIBLE");
		else {
			if(!end) {
				if(nthHeight + (days - nthNote) > max) max = nthHeight + (days - nthNote);
			}
			System.out.println(max);
		}
	}
}