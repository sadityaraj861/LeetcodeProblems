import java.util.Arrays;
import java.util.HashMap;
class Solution {//cant use sorting here because we need index of numbers after sorting the index are mixed and produce mismatch in result.
    public int[] twoSum(int[] nums, int target) {
        
        // int l = 0;
        // int r = nums.length - 1;

        // while (l < r) {
        //     if (nums[l] + nums[r] == target) {
        //         return new int[] { l, r };
        //     }
        //     if (nums[l] + nums[r] < target) {
        //         l++;
        //     }else {
        //         r--;
        //     }
        // }
        // return new int[]{-1,-1};


        HashMap<Integer,Integer> map = new HashMap<>();


        for(int i=0;i<nums.length;i++){

            int complement = target-nums[i];

            if(map.containsKey(complement)){
                return new int[]{i,map.get(complement)};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }    
}