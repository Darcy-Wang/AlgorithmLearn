/**
 * Created by WZZ on 10/29/2016.
 */
public class First_Position_of_Target {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public static int binarySearch(int[] nums, int target) {
        if(nums == null || nums.length ==0){
            return -1;
        }

        int start, end, mid;
        start = 0;
        end = nums.length - 1;
        while( start + 1 < end){
            mid = start + (end - start) / 2;
            if(nums[mid] == target){
                end = mid;
            }else if (nums[mid] > target){
                end = mid;
            }else{
                start = mid;
            }
        }
        if (nums[start] == target)
            return start;

        if (nums[end] == target)
            return end;

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 5, 10};
        int[] nums1 = {};
        System.out.println(binarySearch(nums1, 2));
    }
}
