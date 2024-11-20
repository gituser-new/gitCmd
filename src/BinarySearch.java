public class BinarySearch {

    //O(logn) time.
    /*
    You are given an array of distinct integers nums, sorted in ascending order, and an integer target.

Implement a function to search for target within nums. If it exists, then return its index, otherwise, return -1.t
     */
    public static void main(String[] args) {
        int[] arry= {-1,0,2,4,6,8};
        int target =4;
        System.out.println(search(arry,target));
    }
    public static int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int m = l + ((r - l) / 2);
            if (nums[m] > target) {
                r = m - 1;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
