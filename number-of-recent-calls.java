class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q = new LinkedList();
    }
    
    public int ping(int t) {
        q.add(t);
        //To eliminate out of boundary inputs.
        //working: for the last input, 1 < 2, 1 will be eliminated, size will still be 3.
        while(q.peek() < t-3000) q.poll(); return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
