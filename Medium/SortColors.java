import java.util.*;
public class SortColors{
    public void sortColors(int[] nums){
        if(nums.length==0||nums.length==1) return;
        int index = 0;
        int s = 0; int e = nums.length-1;
        while(index<=e && s<e){
            if(nums[index]==0){
                nums[index] = nums[s];
                nums[s] = 0;
                s++; index++;
            }
            else if(nums[index]==2){
                nums[index] = nums[e];
                nums[e] = 2;
                e--;
            }
            else {
                index++;
            }
        }
    }
}