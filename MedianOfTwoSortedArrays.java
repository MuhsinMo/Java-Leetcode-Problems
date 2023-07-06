import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int n1= nums1.length;
        int n2= nums2.length;
        int c = n1+n2;
        
        int x =0;
        double result = 0;
        int[] mergedArray = new int[c];
        
        System.arraycopy(nums1,0,mergedArray,0,n1);
        System.arraycopy(nums2,0,mergedArray,n1,n2);
        
        Arrays.sort(mergedArray);
        
        if(c%2 !=0)
        {
            x = c/2;
            
            result = mergedArray[x];
        }
        else
        {
            x = c/2;
            result = mergedArray[x]+mergedArray[x-1];
            result = result/2;
        }
        
        return result;
        
    }
}
