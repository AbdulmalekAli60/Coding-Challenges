package ConvertIntigerToSumOfTow;

public class ConvertIntigerToSumOfTowInts {
    public static void main(String[] args) {

        System.out.println(getNoZeroIntegers(11));
    }

    public static int[] getNoZeroIntegers(int n) {
        int[] result = new int[2];

        int a = 0;
        int b = 0;

        for (int i = 1; i < n; i++) {
            a = i;
            b = n - i;

            String aStr = String.valueOf(a);
            String bStr = String.valueOf(b);

            if (aStr.contains("0")) {
                continue;
            }

            if (bStr.contains("0")) {
                continue;
            }

            if ((a + b) == n) {
                result[0] = a;
                result[1] = b;
                return result;
            }
        }

        return result;
    }
}
