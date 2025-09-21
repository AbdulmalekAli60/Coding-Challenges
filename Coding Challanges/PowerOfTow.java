public class PowerOfTow {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }

    public static boolean isPowerOfTwo(int n) {

        if (n <= 0)
            return false;
        if (n == 1)
            return true;

        int sum = 1;

        for (int i = 1; i < n; i++) {

            sum *= 2;

            if (sum == n) {
                return true;
            }
        }

        if (sum == n) {
            return true;

        } else {
            return false;
        }

    }

}
