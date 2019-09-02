import java.util.Arrays;
class Solution {
    public int repeatedNTimes(int[] A) {
        int a = A.length;
        int b = 0;
        Arrays.sort(A);
        for (int i = 0; i < a; i++) {
            if (A[i] == A[(a/2-1)+i]) {
                b = A[i];
                break;
            }
        } return b;
    }
}
