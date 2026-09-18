class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int currSum=0,count=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            int remainder=currSum%k;

            if(remainder<0) remainder+=k;
            if(map.containsKey(remainder)){
                count+=map.get(remainder);
            }
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
        return count;
    }
}