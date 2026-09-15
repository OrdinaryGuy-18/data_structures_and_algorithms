class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen=Integer.MAX_VALUE,sum=0,length=0;
        int left=0,right=0;
        while(right<nums.length){
            sum+=nums[right++];
            length++;
            while(sum>=target){
                sum-=nums[left++];
                minLen=Math.min(minLen,length);
                length--;
            }
        }
        return minLen!=Integer.MAX_VALUE?minLen:0;
    }
}