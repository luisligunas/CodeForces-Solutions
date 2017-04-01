import java.util.Scanner;

public class CF617A {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int x = rennacS.nextInt();
        
        int answer = x/5;
        if(x % 5 != 0) answer++;
        System.out.println(answer);
    }
}