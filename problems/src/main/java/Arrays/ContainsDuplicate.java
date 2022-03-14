package Arrays;

import javax.naming.PartialResultException;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    /*
    Given an integer array nums,
    return true if any value appears at least twice in the array,
    and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true


Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109

     */


    public static void main(String args[]){
        int[] array1={1,4,5,6,8,9,0};
        Set<Integer> duplicatecheck=new HashSet<Integer>();
        int index=0;
        for(index=0;index<array1.length;index++){
            if(!duplicatecheck.add(array1[index])){
                System.out.println("false");
                break;
            }
        }
        if(index>=array1.length) {
            System.out.println("true");
        }
    }
}
