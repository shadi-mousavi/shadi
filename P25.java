import java.util.Scanner;
public class P25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter n");
        int n = input.nextInt();
        int p = 1;
        for(int x = 1; x <= n; x++)
            p = p * x;
        System.out.println(n + "!=" + p);
    }
}
