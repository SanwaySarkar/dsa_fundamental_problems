import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int secondNumber =0;int diff=0;
		int i=0;int j=0;boolean flag = false;
        HashMap<Integer,Integer> dataMap = new HashMap<>();
		for( i=0;i<nums.length;i++) {
			if(dataMap.containsKey(nums[i])){
				dataMap.put(nums[i], dataMap.get(nums[i])+1);
			}
			else
				dataMap.put(nums[i], 1);
		}
        for( i=0;i<nums.length;i++) {
			diff = target-nums[i];
			if(dataMap.containsKey(Integer.valueOf(diff)) && diff!=nums[i]) {
				
				secondNumber = diff;
				break;
			}
        if(dataMap.containsKey(Integer.valueOf(diff)) && diff==nums[i]) {
				int count = dataMap.get(diff);
				secondNumber = diff;
				if(count>1) {
					flag = true;
					break;
				}
				else {
					continue;	
				}
		}
        }
        int temp=0;
        for(j=0;j<nums.length;j++) {
			
			if(secondNumber==nums[j] && (flag)) {
				if(temp==0) {
					temp++;
					continue;
				}
				if(temp==1) {
				break;
				}
			}
			
			if(secondNumber==nums[j] && (!flag)) {
				break;
			}
		}
		int res[] = new int[]{i,j};
        
        return res;
        
    }
}
