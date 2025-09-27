public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(83));
    }

    public static int addDigits(int num) {
        if (num < 10)
            return num;

        if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }
}
