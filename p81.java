import java.util.Scanner;

public class p81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please Enter n");
        int n = scanner.nextInt();
        int s = 0;
        int K = 1;
        while (n > 0) {
            if(n % 10 != 0) {
                s = s + (n % 10) * K;
                K = K * 10;
            }
            n = n / 10;
        }
        System.out.println("s =" + s);
    }
}
