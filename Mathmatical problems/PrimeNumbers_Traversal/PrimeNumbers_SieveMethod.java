public class PrimeNumbers_SieveMethod {

    static void findPrimes(int n) {
        boolean[] p = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            p[i] = true;
        }
        p[0] = false;
        p[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (p[i]) {
                for (int j = i * i; j <= n; j += i) {
                    p[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (p[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 50; 
        System.out.println("Prime numbers up to " + n + " are:");
        findPrimes(n);
    }
}
