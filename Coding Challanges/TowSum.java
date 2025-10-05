public class TowSum {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        int[] indeis = new int[2]; // 0, 1 "Two places for 2 numbers"

        if (nums.length == 2) {
            indeis[1] = 1;
            return indeis;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if ((nums[i] + nums[j]) == target) {
                    indeis[0] = i;
                    indeis[1] = j;
                    return indeis;
                }
            }
        }
        return indeis;// if we reach here its empty;
    }
}
