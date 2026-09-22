class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        int i=1,n=intervals.length;
        int currStart=intervals[0][0];
        int currEnd=intervals[0][1];
        while(i<n){
            int nextStart=intervals[i][0];
            if(nextStart<=currEnd){
                currEnd=intervals[i][1]>currEnd?intervals[i][1]:currEnd;
            }
            else{
                list.add(new int[]{currStart,currEnd});
                currStart=intervals[i][0];
                currEnd=intervals[i][1];
            }
            i++;
        }
        list.add(new int[]{currStart,currEnd});
        int[][] result=list.toArray(new int[list.size()][2]);
        return result;
       
    }
}
