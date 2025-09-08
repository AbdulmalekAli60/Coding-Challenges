package FindIndexOfFirstOccurance;
public class FindIndexOfFirstOccuranceIns {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";

        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {

        if (haystack.isEmpty())
            return -1;
        if (needle.isEmpty())
            return -1;

        int index = haystack.indexOf(needle);
        if (index != -1) {
            return index;
        } else {
            return -1;
        }

        // for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
        // if (haystack.substring(i, j).equals(needle)) {
        // return i;
        // }
        // }
        // return -1;
    }
}
