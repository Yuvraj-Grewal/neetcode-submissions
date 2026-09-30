class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int ans=0;
        for(int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                if(i<=map.get(s.charAt(j))) i=map.get(s.charAt(j))+1;
            }
            map.put(s.charAt(j),j);

            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}
