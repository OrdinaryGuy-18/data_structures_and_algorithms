class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0,maxLen=0;
        Set<Character> set=new HashSet<>();
        int start=0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){;
                set.remove(s.charAt(start++));
            }
            set.add(s.charAt(i));
            length=set.size();
            maxLen=Math.max(maxLen,length);
        }
        return maxLen;
    }
}