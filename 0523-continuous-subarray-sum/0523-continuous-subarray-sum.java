class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);

        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i]%k;
            int remainder=currSum%k;

            if(map.containsKey(remainder)){
                int length=i-map.get(remainder);
                if(length>=2) return true;
            }
            else map.put(remainder,i);
        }
        return false;
    }
}