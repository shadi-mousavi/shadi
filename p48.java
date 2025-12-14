import java.util.Scanner;
public class p48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please Enter n:");
        int n = input.nextInt();
        int  p = 1;
        while (n > 0) {
           int r = n % 10;
            p = p * r;
            n = n / 10;
        }
        System.out.println(p);
    }
}
