
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrom(263));
    }

    public static boolean isPalindrom(int x) {
        try {
            String values = Integer.toString(x);
            
            String reverseValue = new StringBuilder(new String(values)).reverse().toString();

            int reverseValueAsInt = Integer.parseInt(reverseValue);
                
            if (x == reverseValueAsInt) {
                return true;
            }
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            return false;
        }
        return false;
    }
}