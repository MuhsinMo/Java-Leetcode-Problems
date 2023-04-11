import java.util.HashMap;

class Solution {
    
    public int[] twoSum(int[] nums, int target) 
    {
        
        //Creat a hashmap. Map Value:Index
        HashMap<Integer, Integer> p_hash = new HashMap<>();
        
        // loop through entire Array Starting with index 0
        for(int i=0; i<nums.length; i++)
        {
            // check if the diffrence is contained in the hashmap
            if (p_hash.containsKey(target - nums[i]))
            {
                return new int[] {p_hash.get(target - nums[i]), i}; 
            }
            //if not diff is not in the hashmap.
            p_hash.put(nums[i], i);   
        }
        
        return new int[0];
    }
}