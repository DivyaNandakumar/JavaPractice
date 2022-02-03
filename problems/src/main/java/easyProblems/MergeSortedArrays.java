package easyProblems;

import sun.lwawt.macosx.CSystemTray;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 5, 9, 67,71,77, 89};
        int[] array2 = {2,5, 7, 67,90};
        int[] sortedarray;

        if(array1.length>0 && array2.length>0) {
            sortedarray = mergesort(array1, array2);
        }
        else if(array1.length==0){
            sortedarray =array2;
        }
        else {
            sortedarray =array1;
        }

        for(int element:sortedarray){
            System.out.print(element+" ");
        }
    }

    static int[] mergesort(int[] arr1, int[] arr2) {

        int[] sortedarray= new int[arr1.length+arr2.length];

        int arr1index=0,arr2index=0;
        for(int index=0;index<sortedarray.length;index++) {

            if ((arr1index < arr1.length) && arr2index < arr2.length) {
                if (arr1[arr1index] < arr2[arr2index]) {
                    sortedarray[index] = arr1[arr1index];
                    arr1index++;
                } else {
                    sortedarray[index] = arr2[arr2index];
                    arr2index++;
                }
            } else {
                if (arr1index >= arr1.length) {
                    sortedarray[index] = arr2[arr2index];
                    arr2index++;
                } else {
                    sortedarray[index] = arr1[arr1index];
                    arr1index++;
                }
            }
        }
        return sortedarray;
    }

}
