class Solution(object):
    def selfDividingNumbers(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: List[int]
        """
        # map to do casting once
        return [x for x in range(left, right+1) 
                # if both conditions are true
                if all((i and (x % i==0) 
                        for i in map(int, str(x))))]
