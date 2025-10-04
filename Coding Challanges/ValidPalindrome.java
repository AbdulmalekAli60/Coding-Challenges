public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {

        String processedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        if (s.equals(" ") || processedString.equals(""))
            return true;

        int j = processedString.length() - 1;

        // System.out.println("Original without processing: " + s);
        // System.out.println("Actual processing: " +
        // s.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""));
        // System.out.println("Original lenght: " + s.length());
        // System.out.println("Processed length: " + processedString.length());

        // System.out.println("J: " + j);
        // System.out.println("Result: " + (processedString.charAt(0) ==
        // processedString.charAt(j - 1)) );
        // System.out.println(s.charAt(1));
        // System.out.println(s.charAt(j));

        // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
        // [a ,m ,a ,n ,a ,p ,l ,a ,n ,a ,c ,a ,n, a ,l, p, a, n , a ,m ,a]

        for (int i = 0; i < processedString.length(); i++) {
            System.out.println("J: " + j);
            System.out.println("i: " + i);

            if (processedString.charAt(i) == processedString.charAt(j)) {
                j--;

                if (i == processedString.length() - 1) {
                    return true;
                }
                continue;
            } else {
                return false;
            }
        }

        return false;
    }

            
        // String processedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // if(processedString.isEmpty()) return true;

        // int i = 0;
        // int j = processedString.length() - 1; 

        // while(i < j){
        //     if(processedString.charAt(i) != processedString.charAt(j)){
        //         return false;
        //     }

        //     i++;
        //     j--;
        // }

        // return true;
}
