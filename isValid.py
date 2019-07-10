class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        op = ["(","{","["]
        cl = [")","}","]"]
        stack = []
        for i in s:
            if i in op: stack.append(i)
            elif i in cl:
                temp = cl.index(i)
                if len(stack) > 0 and op[temp] == stack[len(stack)-1]: stack.pop()
                else: return False
        if len(stack) == 0: return True
