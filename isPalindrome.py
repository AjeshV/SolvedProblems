class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        return (''.join(e for e in s if e.isalnum()).lower() == ''.join(e for e in s if e.isalnum()).lower()[::-1])
