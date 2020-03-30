import java.util.*;
public class ThreeSumClose{
    public int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
		int res = nums[0]+nums[1]+nums[nums.length-1];
		for(int i=0; i<nums.length-2;i++){
			int s = i+1; int e = nums.length-1;
			while(s<e){
				int sum = nums[i]+nums[s]+nums[e];
				if(sum<target){
					s++;
				} else {
					e--;
				}
				if(Math.abs(target-res)>Math.abs(target-sum)) res = sum;
			}
		}
		return res;
    }
}