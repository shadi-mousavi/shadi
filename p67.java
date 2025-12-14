import java.util.Scanner;
public class p67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int c = 0;
        for(int x = 1; x <= 5; x++) {
            int n = input.nextInt();
            int m = n;
            int p = 0;
            while (n > 0) {
                int r = n % 10;
                p = (p * 10) + r;
                n = n / 10;
            }
            if (p == m) {
                c++;
            }
        }
        System.out.println(c);
    }
}
