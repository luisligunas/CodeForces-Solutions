import java.util.Scanner;

public class CF4A {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int x = rennacS.nextInt();
        if(x % 2 == 0 && x != 2) System.out.println("YES");
        else System.out.println("NO");
    }
}