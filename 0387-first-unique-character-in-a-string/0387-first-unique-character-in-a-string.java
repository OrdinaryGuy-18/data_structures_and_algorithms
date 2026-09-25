class Solution {
    public int firstUniqChar(String s) {
        int index=-1;
        int[] freq=new int[26];
        for(Character ch:s.toCharArray()){
            freq[ch-'a']++;
        }

        for(Character ch:s.toCharArray()){
            if(freq[ch-'a']==1){
                index=s.indexOf(ch);
                break;
            }
        }
        return index;
    }
}