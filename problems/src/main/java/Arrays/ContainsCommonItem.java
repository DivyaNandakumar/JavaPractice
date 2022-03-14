package Arrays;

import java.util.*;

public class ContainsCommonItem {
    /* Question
    Given 2 arrays create a function that let's a user know (true/ false)
    whether these two arrays conatin andy common items
    Fo example
    array1 = ['a, 'b','c','x'];
    array2 = ['i', 'y', 'x', 'j'];
    should return true as x is common
     */


    /*
    Solution thoughts
    1. one or both array can be empty
    2. size of both the arrays might differ
    3. there might be more than one common
    4. best case scenario both have the common item in start
    5. worst case both have item in end
    6. inputs are strings? integers or mix of anything?

    Queries:
    1. is the arrays sorted? if no can we sort them on any basis?((O(nlogn))
    2. is it true or false if both arrays are empty or null? or should we throw errors?

    Solution options
    1. Brute force : iterate through each item one by one with nexted for loops (O(n^2))
    2. sort the arrays using radix O(nk) or counting sort O(n+k) and then do binary search for each element
    from the first element in both array that is larger as the smaller one wont be present in the other array obviously O(logn)
    3. we can convert one of the array as a Hashset and call the contains() (time complexity is O(1)) for each array.
    */


    static boolean checkCommon(String[] array1, String[] array2) {

        int index=0;
        Set<String> set=new HashSet<>(Arrays.asList(array1));
        for (index = 0; index < array2.length; index++) {
            if (set.contains(array2[index])){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){
        String[] str1={"a","b","c","f"};
        String[] str2={"g","t","w","h"};
        System.out.println(checkCommon(str1,str2));
    }

}
