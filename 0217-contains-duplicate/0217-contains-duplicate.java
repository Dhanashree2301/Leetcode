class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashSet<Integer> hset=new HashSet();
         for(int ind=0;ind<nums.length;ind++)
         {
        
         if(hset.contains(nums[ind]))
         {
             return true;
         }
         hset.add(nums[ind]);
    }
        return false;
    }
}
