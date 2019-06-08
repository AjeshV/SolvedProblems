from collections import Counter
class Solution:
    def numJewelsInStones(self, J: str, S: str) -> int:
        a = Counter(J)
        b = Counter(S)
        c = a.keys() & b.keys()
        count = 0
        for d in c:
            count += max(a[d], b[d])
        return count
