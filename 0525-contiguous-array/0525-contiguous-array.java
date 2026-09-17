class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);

        int currSum=0,maxLen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) currSum-=1;
            else currSum+=1;

            System.out.print(currSum+" ");

            if(map.containsKey(currSum)){
                maxLen=Math.max(maxLen,i-map.get(currSum));
            }
            else map.put(currSum,i);
        }
        return maxLen;
    }
}