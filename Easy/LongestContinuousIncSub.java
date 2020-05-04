import java.util.*;

public class LongestContinuousIncSub {
    public int findLengthOfLCIS(int[] nums){
        int maxL = 1;
        int max = 0;
        if(nums==null||nums.length==0) return 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                maxL++;
            } else{
                max = Math.max(max, maxL);
                maxL=1;
            }
        }
        
        if(max>maxL) return max;
        else return maxL;
    }
}