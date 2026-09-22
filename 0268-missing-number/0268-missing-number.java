class Solution {
    public int missingNumber(int[] nums) {
        int missing=0;
        for(int i=1;i<=nums.length;i++){
            missing=missing^i;
        }

        for(int x:nums){
            missing=missing^x;
        }
        return missing;
    }
}