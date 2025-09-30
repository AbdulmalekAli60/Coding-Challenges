import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 45, 6, 1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> n = new HashSet<>();

        for (int num : nums) {
            if (n.contains(num)) {
                return true;
            }
            n.add(num);
        }
        return false;
    }
}
