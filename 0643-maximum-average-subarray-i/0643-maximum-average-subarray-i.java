class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average=0.0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        average=sum/k;
        for(int i=0;i<nums.length-k;i++){
            sum-=nums[i];
            sum+=nums[i+k];
            average=Math.max(average,sum/k);
        }
        return average;
    }
}