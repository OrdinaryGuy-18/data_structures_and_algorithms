class Solution {
    public int strStr(String haystack, String needle) {
        String temp="";
        int len=needle.length();
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                temp=haystack.substring(i,i+len>haystack.length()?haystack.length():i+len);
                if(temp.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}