class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        count = 0
        output = []
        for i in range (0, len(nums)):
            for j in range (0, len(nums)):
                if j != i and nums[j] < nums[i]:
                    count += 1
            output.append(count)
            count = 0
        return output
