class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        ArrayList<String> answer=new ArrayList<>();
        Set<String> set=new HashSet<>();

        int left=0;
        int right=10;
        while(right<=s.length()){
            String sequence=s.substring(left,right);
            if(set.contains(sequence) && !answer.contains(sequence)) answer.add(sequence);
            set.add(sequence);
            left++;
            right++;
        }
        return answer;
    }
}