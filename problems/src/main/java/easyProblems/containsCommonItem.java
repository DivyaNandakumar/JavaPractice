package easyProblems;

public class containsCommonItem {
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

    Queries:
    1. is the arrays sorted? if no can we sort them on any basis?((O(nlogn))
    2. is it true or false if both arrays are empty or null? or should we throw errors?

    Solution options
    1. Brute force : iterate through each item one by one with nexted for loops (O(n^2))
    2. sort the arrays using radix O(nk) or counting sort O(n+k) and then do binary search for each element
    from the first element in both array that is larger as the smaller one wont be present in the other array obviously O(logn)
     */
}
