class Solution {
    public int longestOnes(int[] nums, int k) {
        int ones=0,maxLen=0;
        int left=0,right=0;
        while(right<nums.length){
            if(nums[right]==1) ones++;
            while((right-left+1)-ones>k){
                if(nums[left]==1) ones--;
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}