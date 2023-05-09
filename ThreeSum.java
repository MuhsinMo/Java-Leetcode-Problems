import java.util.ArrayList;
import java.util.Arrays;
class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        // Return the result as a list of list
        ArrayList <List<Integer>> result = new ArrayList <List<Integer>>();
        //Sort Array
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++)
        {
            
            int left = i+1; // left pointer 
            int right = nums.length -1; // right pointer
            
            //check if current an previous number are equal
            if(i>0 && nums[i] == nums[i-1])
            {
                continue;
            }
            
            while(left < right)
            {
                //check duplicates on the right side of the list
                if(right < nums.length - 1 && nums[right]==nums[right+1])
                {
                    right--;
                    continue;
                }
                //Add new array list of list if triplets
                if (nums[i]+nums[left]+nums[right] == 0)
                {
                     ArrayList <Integer> myList = new ArrayList<Integer>();
                    myList.add(nums[i]);
                    myList.add(nums[left]);
                    myList.add(nums[right]);
                    result.add(myList);
                    left++;
                    right--;
                }
                else if(nums[i]+nums[left]+nums[right] < 0)
                {
                    left++;
                }
                else 
                {
                    right --;
                } 
                
            }
            
        }//end of main loop
      
        
        return result;
    }
    
    
}
