import java.util.Arrays;
class Solution {
    public int minMeetingRooms(int[][] intervals) {
        
        int count = 0;
        //sort based on start time
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        
        for (int arr[]: intervals) {
            if (minheap.isEmpty()){
                count++;
                minheap.offer(arr[1]);
            } else {
                //2nd start ! >, we'll need another room.
                if (arr[0] >= minheap.peek())
                    minheap.poll();
                else
                    count++;
                minheap.offer(arr[1]);
            }
        }
        return count;
    }
}
