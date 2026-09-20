class Solution {
    public int reverseDegree(String s) {
        int revDeg=0;
        for(int i=0;i<s.length();i++){
            revDeg+=((i+1)*('z'-s.charAt(i)+1));
        }
        return revDeg;
    }
}