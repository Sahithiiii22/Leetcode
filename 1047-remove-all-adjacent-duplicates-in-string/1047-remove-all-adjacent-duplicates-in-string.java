class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        StringBuilder sh = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(sh.length()==0){
                sh.append(ch);
            }
            else if(sh.charAt(sh.length()-1) == ch){
                sh.deleteCharAt(sh.length()-1);
            } else {
                sh.append(ch);
            }

        }
        return sh.toString();
    }
}
        
     
        