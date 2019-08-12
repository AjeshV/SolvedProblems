static int pairs(int k, int[] arr) {
        int numpairs = 0, n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                if (Math.abs(arr[i] - arr[j]) == k){ 
                    numpairs++;
                    break;
                }
            }
        }
        return numpairs;
}
