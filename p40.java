public class p40 {
    public static void main(String[] args) {
        int count = 0;
        int x = 2;
        while (count < 50) {
            int k = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    k++;
                }
            }
            if (k == 2) {
                count++;
            }
                x++;
        }
        System.out.println(x - 1);
    }
}
