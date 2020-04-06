import java.util.*;

public class RotateArray {
    public void rotate(int[] nums, int k){
        k%=nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    private void reverse(int[] nums, int s, int e){
        while(s<e){
            int tmp = nums[e];
            nums[e]=nums[s];
            nums[s]=tmp;
        }
    }
}