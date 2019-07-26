from operator import itemgetter
class Solution(object):
    def reorderLogFiles(self, logs):
        """
        :type logs: List[str]
        :rtype: List[str]
        """
        return sorted(logs, key=itemgetter(1))
