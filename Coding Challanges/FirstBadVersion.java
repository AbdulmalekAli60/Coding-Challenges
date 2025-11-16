public class firstBadVersion {
    public static void main(String[] args) {
        System.out.println("d");
    }

//    public int firstBadVersion(int n) {
//        if (n == 1)
//            return n;
//
//        int start = 1;
//        int end = n;
//        int firstBad = n;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (isBadVersion(mid)) {
//                firstBad = mid;
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//        return firstBad;
//    }
}

// other solution but high excution time
// public int firstBadVersion(int n) {
// if(n == 1) return n;

// for(int i = n; i > 0; i--){
// System.out.println(i);

// if(isBadVersion(i) && isBadVersion(i - 1)){
// continue;
// }

// if(isBadVersion(i) && !isBadVersion(i - 1)){
// return i;
// }

// }
// return 0;
// }
