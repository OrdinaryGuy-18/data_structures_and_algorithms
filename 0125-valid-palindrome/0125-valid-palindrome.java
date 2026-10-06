class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90) st.append((char)(s.charAt(i)+32));
            else if(s.charAt(i)>=97 && s.charAt(i)<=122) st.append(s.charAt(i));
            else if(s.charAt(i)>='0' && s.charAt(i)<='9') st.append(s.charAt(i));
        }

        int left=0;
        int right=st.length()-1;
    
        while(left<right){
            if(st.charAt(left)!=st.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}