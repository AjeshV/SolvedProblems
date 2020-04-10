class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int a = nums.length;
        int count = 0;
        int[] counts = new int[a];
        int k = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j != i && (nums[j]<nums[i])) {
                    count++;
                }
            }
            counts[k++] = count;
            count = 0;
        }
        return counts;
    }
}
