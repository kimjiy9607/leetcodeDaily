import java.util.*;

public class NextPermutation{
    public void nextPermutation(int[] nums){
        if(nums==null||nums.length==0||nums.length==1) return;
        
        int minInd = -1;
        int min = 0;
        for(int i=nums.length-1; i>0; i--){
            if(nums[i]>nums[i-1]){
                minInd = i-1;
                min = nums[i-1];
                break;
            }
        }
        
        if(minInd == -1){
            reverse(nums, 0, nums.length-1);
            return;
        }
        
        for(int i=nums.length-1; i>minInd; i--){
            if(nums[minInd]<nums[i]){
                swap(nums, minInd, i);
                break;
            }
        }
        reverse(nums, minInd+1, nums.length-1);
        return;
    }
    
    private void reverse(int[]nums, int start, int end){
        while(start<end){
            swap(nums, start, end);
            start++; end--;
        }
    }
    
    private void swap(int[] nums, int i1, int i2){
        int tmp = nums[i2];
        nums[i2] = nums[i1];
        nums[i1] = tmp;
    }    
    
}