import java.util.Scanner;

public class P82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please Enter n");
        int n = scanner.nextInt();
        int s = 0;
        int k = 1;
        while (n > 0) {
            s = s + (n % 2) * k;
            k = k * 10;
            n = n / 2;
        }
        System.out.println("s =" + s);
    }
}
