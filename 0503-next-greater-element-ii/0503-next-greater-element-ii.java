class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] stack=new int[n];
        int[] result=new int[n];
        Arrays.fill(result,-1);
        int top=-1;
        for(int i=2*n-1;i>=0;i--){
            int index=i%n;
            while(top>=0 && nums[index]>=stack[top]) top--;
            if(i<n && top>=0) result[i]=stack[top];
            stack[++top]=nums[index];
        }
        return result;
    }
}