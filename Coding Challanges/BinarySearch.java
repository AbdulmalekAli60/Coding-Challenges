public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {

        System.out.println(nums.length);
        int start = 0;
        int end = nums.length - 1; 
        boolean flag = false;
        while(start <= end && flag == false){

            int mid = (start + end) / 2; 
            System.out.println(mid);
            if(nums[mid] == target){
                flag = true;
                return mid;
            }

            if(nums[mid] > target){
                end = mid - 1;
            }

            if(nums[mid] < target){
                start = mid + 1;
            }
        }
         return -1;
    }
}

