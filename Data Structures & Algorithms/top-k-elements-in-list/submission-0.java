class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<int[]> lst=new ArrayList<>();
        for(int n : map.keySet()){
            lst.add( new int[]{n,map.get(n)} );
        }
        lst.sort(Comparator.comparingInt(a -> a[1]));
        int[] ans=new int[k];
        int j=k-1;
        for(int i=lst.size()-1;i>=0;i--){
            if(j<0) break;
            ans[j]=lst.get(i)[0];
            j--;
        }
        return ans;
    }
}
