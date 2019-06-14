import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        int missing = 1;
        
        boolean check = Arrays.stream(A).anyMatch(x -> x == 1);
        if (check == false)
            return missing;
        else{
            if (n == 1) //single element
                return missing+1;
            else{
                for(int i = 0; i < n-1; i++){
                    if (Math.abs(A[i+1]-A[i]) > 1){
                        if(A[i] > 0)
                            missing = A[i]+1;
                    }else //continuous +ve sequence 
                        missing = A[i+1]+1;
    			      }
    			  return missing;
            }
		    }
    }
}
