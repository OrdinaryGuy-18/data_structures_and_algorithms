class Solution {
    public int maxSubArray(int[] nums) {
        int prevSum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(prevSum+nums[i]>=nums[i]){
                prevSum+=nums[i];
            }
            else{
                prevSum=nums[i];
            }
            maxSum=Math.max(maxSum,prevSum);
        
        }
        return maxSum;
    }
}