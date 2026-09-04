class Solution {
    public boolean chck(String a,String b){
        if(a.length()!=b.length()) return false;
        int[] alpha=new int[26];
        for(int i=0;i<a.length();i++){
            alpha[a.charAt(i)-'a']++;
            alpha[b.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(alpha[i]!=0) return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans= new ArrayList<>();
        int[] visited=new int[strs.length];
        for(int i=0;i<strs.length;i++){
            if(visited[i]==1) continue;
            String temp=strs[i];
            List<String> l=new ArrayList<>();
            l.add(temp);
            visited[i]=1;
            for(int j=i+1;j<strs.length;j++){
                if(chck(temp,strs[j])){
                    visited[j]=1;
                    l.add(strs[j]);
                }
            }
            ans.add(l);
        }
        return ans;
    }
}
