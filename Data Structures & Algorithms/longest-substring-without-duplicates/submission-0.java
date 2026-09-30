class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        HashSet<Character> mp=new HashSet<>();
        int ans=0;
        for(int j=0;j<s.length();j++){
            while(mp.contains(s.charAt(j))) {
                mp.remove(s.charAt(i));
                i++;
            }
            mp.add(s.charAt(j));

            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}
