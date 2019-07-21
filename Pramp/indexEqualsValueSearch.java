import java.io.*;
import java.util.*;

class Solution {
  
  public static int indexEqualsValueSearch(int[] arr) {
    // your code goes here
    for (int i=0; i< arr.length; i++){
      if (i == arr[i]){
        return i;
      }
    }
    return -1;
  }
}
