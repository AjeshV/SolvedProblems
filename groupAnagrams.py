class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        dict = {}
        for i in strs:
            key = ''.join(sorted(i))
            if key in dict: dict.get(key).append(i) # grouping here
            else: dict[key] = [i]
        return dict.values()
