import java.util.Scanner;

public class p59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please Enter n");
        int n = scanner.nextInt();
        int p=2;
        while (n > 1) {
            int k = 0;
            while (n % p == 0) {
                n = n / p;
                k++;
            }
            if (k > 0)
                System.out.println(p + "^" + k + "*");
            p++;
        }
    }
}
