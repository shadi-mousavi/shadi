public class p41 {
    public static void main(String[] args) {
        long a = 0;
        long b = 1;
        System.out.println(a);
        System.out.println(b);
        int k = 2;
        while (k < 50) {
            long c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            k++;
        }
    }
}
