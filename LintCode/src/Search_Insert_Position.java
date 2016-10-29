/**
 * Created by WZZ on 10/29/2016.
 */
public class Search_Insert_Position {
    /**
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     * 注意边界条件，以及插入位置
     */
    public static int searchInsert(int[] nums, int target) {
        int start, end, mid;
        start = 0;
        end = nums.length - 1;

        if(nums == null || nums.length == 0 || nums[start] > target){
            return start;
        }
        if(nums[end] < target) {
            return end + 1;
        }

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
        if (nums[end] == target) {
            return end;
        }else if (nums[start] == target) {
            return start;
        }else{
            return end;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 5, 10};
        int[] nums1 = {};
        int[] nums2 = {1,3,5,6};
        System.out.println(searchInsert(nums2, 5));
    }
}
