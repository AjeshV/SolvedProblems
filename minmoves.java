 public int solution(String s){
        //baaaaa = calculate distance i = 1 to 5, (aaaaa), 1 move
        //next move to i = 5 and repeat process.
        int res = 0;
        for (int i = 0; i < s.length(); i++){
            int next = i+1;
            while (next < s.length() && s.charAt(i) == s.charAt(next)) next++;
            res += (next-i)/3;
            i = next;
        }
        return res;
    }
