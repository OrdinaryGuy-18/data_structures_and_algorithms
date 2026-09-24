class Solution {
    private int digitSum(int n){
        int sum=0;
        while(n>0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }

    public int smallestIndex(int[] nums) {
        int smallestIndex=-1;
        for(int i=0;i<nums.length;i++){
            if(i==digitSum(nums[i])){
                smallestIndex=i;
                break;
            }
        }
        return smallestIndex;
    }
}