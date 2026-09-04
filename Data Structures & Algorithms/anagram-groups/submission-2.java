class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans= new ArrayList<>();
        HashMap< String , List<String> > map=new HashMap<>();

        for(String str : strs){
            int[] alpha=new int[26];
            for(int i=0;i<str.length();i++) {
                alpha[str.charAt(i)-'a']++;
            }

            StringBuilder s=new StringBuilder();
            for(int n : alpha){
                s.append('X').append(n);
            }

            String k=s.toString();
            if(map.containsKey(k)) map.get(k).add(str);
            else {
                List<String> l=new ArrayList<>();
                l.add(str);
                map.put(k,l);
            }
        }
        for(List<String> temp : map.values()) ans.add(temp);
        return ans;
    }
}
