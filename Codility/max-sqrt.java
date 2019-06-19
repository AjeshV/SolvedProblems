import java.lang.Math;

public class Solution {

	public static void main(String[] args) {
		int A =  Integer.parseInt(args[0]), B = Integer.parseInt(args[1]);
		int count = 0;
		for (int i = A; i <= B; i++){
			int current = 0, j = i;
			if(Math.sqrt(j) == (int)Math.sqrt(j)) {
				while(Math.sqrt(j) == (int)Math.sqrt(j)){
					j = (int)Math.sqrt(j);
					current++;
				}
				if (current > count) count = current;
			}	
	    	}
	    	System.out.println(count);
	}
}
