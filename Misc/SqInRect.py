class Solution(object):
    def SqInRect(a, b):
        l = []
        c = min(a, b)
        l.append(c)
        t = abs(max(a,b) - c)
        l += SqInRect(t, c) if t > 0
        return l    
