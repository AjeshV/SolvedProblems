class Solution(object):
    def validSquare(self, p1, p2, p3, p4):
        """
        :type p1: List[int]
        :type p2: List[int]
        :type p3: List[int]
        :type p4: List[int]
        :rtype: bool
        """
        if p1==p2==p3==p4: return False
        
        def dist(a,b): return (a[0]-b[0])**2 + (a[1]-b[1])**2
        d = [dist(p1,p2),dist(p1,p3),dist(p1,p4),dist(p2,p3),dist(p2,p4),dist(p3,p4)]
        
        d.sort() #To segregate diagonals
        if d[0]==d[1]==d[2]==d[3]: 
            if d[4]==d[5]: return True
        
        return False
