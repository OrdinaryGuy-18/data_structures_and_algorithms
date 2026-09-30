class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int depth=0;
        int[] answer=new int[seq.length()];

        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='('){
                answer[i]=depth%2;
                depth++;
            }
            else{
                depth--;
                answer[i]=depth%2;
            }
        }
        return answer;
    }
}