class Solution {
    public int maxArea(int[] height) {
        int amount=0,maxAmount=0;
        int left=0,right=height.length-1;
        while(left<=right){
            amount=(right-left)*Math.min(height[left],height[right]);
            maxAmount=Math.max(maxAmount,amount);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return maxAmount;
    }
}