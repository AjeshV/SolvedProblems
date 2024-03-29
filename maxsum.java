package solvedproblems;

import java.util.HashMap;
import java.util.Map;

public class Maxsum {
    private int computeDigitSum(int a){
        // supposed to be valid for negative numbers and the output must be non-negative integer.
        a = Math.abs(a);
        int res = 0;
        while(a > 0){
            res += a % 10;
            a /= 10;
        }
        return res;
    }
    public int maxSum(int[] A){
        int N = A.length;
        if(N <= 1) return -1;
        Map<Integer, Integer> map = new HashMap<>();
        int res = -1;
        for(int i = 0; i < N; i++){
            int digitsum = computeDigitSum(A[i]);
            if(!map.containsKey(digitsum)){
                map.put(digitsum, A[i]);
            }
            else{
            	//collecting whichever is max value for a addeddigit in hashmap
            	//and have the biggest number there, total in res
            	
                //res = current highest, n+A[i] = next calculated
            	
            	res = Math.max(res, map.get(digitsum) + A[i]);
                map.put(digitsum, Math.max(A[i], map.get(digitsum)));
            }
        }
        return res;
    }
    public static void main(String[] args) {
    	Maxsum main = new Maxsum();
        int[][] testcases = {{51, 71, 17, 42, 33, 44, 24, 62}, 
                             {51, 71, 17, 42},
                             {42, 33, 60},
                             {51, 32, 43}};
        for(int[] testcase: testcases)
            System.out.println(main.maxSum(testcase));
    }
}
