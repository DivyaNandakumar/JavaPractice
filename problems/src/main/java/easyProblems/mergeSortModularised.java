package easyProblems;

public class mergeSortModularised {static int[] array1 = {1, 2, 3, 5, 9, 67,71,77, 89};
    static int[] array2 = {2,5, 7, 67,90};
    static int[] sortedarray1 =new int[array1.length+array2.length];

    static int arr1index=0,arr2index=0;

    // yet to resolve arrayoutofbound

    public static void main(String[] args) {

        if(array1.length>0&&array2.length>0) {
            sortedarray1 = mergesort(array1, array2);
        }
        else if(array1.length==0){
            sortedarray1 =array2;
        }
        else {
            sortedarray1 =array1;
        }

        for(int element:sortedarray1){
            System.out.print(element+" ");
        }
    }

    static int[] mergesort(int[] arr1, int[] arr2) {

        int[] sortedarray= new int[arr1.length+arr2.length];
        for(int index=0;index<sortedarray.length;index++) {

            if ((arr1index < arr1.length) && arr2index < arr2.length) {
                sortedarray=pushArray1(arr1, arr2, sortedarray, index);
                if ((arr1index < arr1.length) && arr2index < arr2.length) {
                    sortedarray = pushArray2(arr1, arr2, sortedarray, index);
                }
            }
            else {
                sortedarray = pushLargerArrayElements(arr1, arr2, sortedarray, index);
            }
        }
        return sortedarray;
    }

    static int[] pushArray1(int[] arr1, int[] arr2, int[] sortedarray,int index){
        if (arr1[arr1index] < arr2[arr2index]) {
            sortedarray[index] = arr1[arr1index];
            arr1index++;
        }
        return sortedarray;
    }

    static int[] pushArray2(int[] arr1, int[] arr2,int[] sortedarray,int index){
        if (arr2[arr2index] <=arr1[arr1index]) {
            sortedarray[index] = arr2[arr2index];
            arr2index++;
        }
        return sortedarray;
    }

    static int[] pushLargerArrayElements(int[] arr1, int[] arr2, int[] sortedarray,int index){

        if(arr2index >= arr2.length) {
            sortedarray[index] = arr2[arr1index];
            arr1index++;
        }
        else{
            sortedarray[index] = arr1[arr2index];
            arr2index++;
        }
        return sortedarray;
    }

}
