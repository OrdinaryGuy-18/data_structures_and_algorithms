class Solution {
    public boolean isValid(String s) {
        int top=-1;
        char[] stack=new char[s.length()];
        for(Character ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{')
            {
                stack[++top]=ch;
            }
            else{
                if(top>=0 && ch==')' && stack[top]=='(') top--;
                else if(top>=0 && ch=='}' && stack[top]=='{') top--;
                else if(top>=0 && ch==']' && stack[top]=='[') top--;
                else return false;
            }
        }
        if(top==-1) return true;
        return false;
    }
}