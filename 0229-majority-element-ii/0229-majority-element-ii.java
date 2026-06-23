class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        List<Integer> ans2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           ans.put(nums[i], ans.getOrDefault(nums[i], 0) + 1);
        }
       for (Map.Entry<Integer, Integer> entry : ans.entrySet()) {
    
    int count = entry.getValue();
    if(count>nums.length/3){
        ans2.add(entry.getKey());
    }


    }
   return ans2;     
}
}