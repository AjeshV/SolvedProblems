class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> tunnel = new ArrayList<Integer>();
        int diff;
        int[] indices = new int[2];
        
        for (int i = 0; i < nums.length; i++){
            diff = target - nums[i];
            if (tunnel.contains(diff)){
                indices[0] = tunnel.indexOf(diff);
                indices[1] = i;
                break;
            }else{
                tunnel.add(nums[i]);
            }
                
        } return indices;
    }
}

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
