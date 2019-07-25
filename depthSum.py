class Solution(object):
    def depthSum(self, nestedList):
        """
        :type nestedList: List[NestedInteger]
        :rtype: int
        """
        count = 0
        s = []
        if not nestedList: return 0
        for i in nestedList: s.append((i,1))
        while s:
            l, n = s.pop(0)
            if l.isInteger(): count += n * l.getInteger()
            else: 
                for j in l.getList(): s.append((j,n+1))
        return count
