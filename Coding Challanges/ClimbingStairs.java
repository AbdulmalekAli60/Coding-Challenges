public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairsSteps(1));

    }

    public static int climbStairsSteps(int n){
        if(n <= 2) return 2;
        
           
        return climbStairsSteps(n - 1) + climbStairsSteps(n - 2);
    }
}
