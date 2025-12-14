public class p75 {
    public static void main(String[] args) {
         for (int x = 1; x <= 8; x++) {
              int n = 0;
              for (int y = 1; y <= 8; y++) {
                  n = x * y;
                  int s = 0;
                  int p = 1;
                  while (n > 0) {
                      s = s + (n % 8) * p;
                      p = p * 10;
                      n = n / 8;
                  }
                  System.out.println(x + "*" + y + "=" + s +" ");
              }
              System.out.print("\n");
         }
    }
}
