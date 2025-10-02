public class WatterBottles {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(15, 4));
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunkBottles = 0;
        int emptyBottles = 0;

        while (numBottles > 0 || emptyBottles >= numExchange) {
            totalDrunkBottles += numBottles;
            emptyBottles += numBottles;

            numBottles = 0;

            int newFullBottles = emptyBottles / numExchange;

            int remainingEmptyBottles = emptyBottles % numExchange;

            numBottles = newFullBottles;
            emptyBottles = remainingEmptyBottles;

            if (numBottles == 0 && emptyBottles < numExchange) {
                break;
            }
        }
        return totalDrunkBottles;
    }
}
