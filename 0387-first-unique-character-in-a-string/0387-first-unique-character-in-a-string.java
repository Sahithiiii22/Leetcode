class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        HashMap <Character,Integer> hm = new HashMap<>();
        int ans= -1;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            if(hm.get(ch) == 1){
                ans = i;
                break;
            }
        }

        return ans;
    }
}