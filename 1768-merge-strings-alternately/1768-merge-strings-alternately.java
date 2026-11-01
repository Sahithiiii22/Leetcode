class Solution {
    public String mergeAlternately(String word1, String word2) {
        

        int n = word1.length();
        int m = word2.length();

        StringBuilder empty = new StringBuilder();

        for (int i = 0; i < Math.max(m, n); i++) {
            if (i < n) {
                empty.append(word1.charAt(i));
            }

            if (i < m) {
                empty.append(word2.charAt(i));
            }
        }

        
    return empty.toString();
}
}

    
