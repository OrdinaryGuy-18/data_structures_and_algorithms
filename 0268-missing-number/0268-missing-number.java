class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]<nums.length){
                int correctIndex=nums[i];
                if(nums[i]!=nums[correctIndex]){
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
                }
                else{
                    i++;
                }
            }
            else i++;
        }

        int missing=nums.length;
        for(i=0;i<nums.length;i++){
            if(i!=nums[i]){
                missing=i;
                break;
            }
        }

        return missing;
    }
}