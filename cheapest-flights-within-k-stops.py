class Solution(object):
    def findCheapestPrice(self, n, flights, src, dst, K):
        """
        :type n: int
        :type flights: List[List[int]]
        :type src: int
        :type dst: int
        :type K: int
        :rtype: int
        """
        # based on dijkstra's.  
        # defaultdict to create items that !exist.
        flight = collections.defaultdict(dict)
        for sr, ds, price in flights: flight[sr][ds] = price
        minheap = [(0, src, K+1)]
        while minheap:
            p, i, k = heapq.heappop(minheap)
            if i == dst: return p
            if k > 0:
                
                # aggregate possible paths and its prices
                for j in flight[i]: heapq.heappush(minheap, (p + flight[i][j], j, k-1))
                    
        return -1
