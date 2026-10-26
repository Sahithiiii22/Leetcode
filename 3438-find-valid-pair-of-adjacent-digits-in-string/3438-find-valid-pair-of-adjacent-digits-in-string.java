

class Solution {
    public String findValidPair(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length() - 1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);

            if (a != b && hm.get(a) == a - '0'
                       && hm.get(b) == b - '0') {
                return "" + a + b;
            }
        }

        return "";
    }
}