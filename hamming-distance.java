class Solution {
    public int hammingDistance(int x, int y) {
    //Count XOR (1 only if either is 1) 1's
        return Integer.bitCount(x ^ y);
    }
}
