class Solution {
    public boolean containsDuplicate(int[] nums) {
        // boolean result=false;
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]==nums[j])
        //         {
        //             result=true;
        //         }
        //     }
        // }
        // return result;
        
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


//  HashSet<Integer> hset = new HashSet<Integer>();
//         // Traverse all the elements through the loop...
//         for (int idx = 0; idx < nums.length; idx ++){
//             // Searches hashset. if present, it contains duplicate...
//             if (hset.contains(nums[idx])){
//                 return true;
//             }
//             // if not present it will update hashset...
//             hset.add(nums[idx]);
//         }
//         // Otherwise return false...
//         return false;