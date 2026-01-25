class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> freq = new HashMap<>();

        if(s.length() != t.length()) return false;
        for(char c : s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0) + 1);
        }
        for(int j=0;j<t.length();j++){
            char ch = t.charAt(j);
            if(!freq.containsKey(ch)) return false; // stuck point 
            freq.put(ch,freq.get(ch) - 1);
        }

        for(int value: freq.values()){
            if(Math.abs(value) > 0) return false;
        }
        return true;
    }
}