package Arrays;

public class MergeSortedArrays {
    static int[] arr1 = {1, 2, 3, 5, 9, 67, 71, 77, 89};
    static int[] arr2 = {1, 3, 5, 11, 67, 75, 87, 101};
    static int[] sortedarray = new int[arr1.length + arr2.length];
    static int arr1index = 0, arr2index = 0, index = 0;

    public static void main(String[] args) {
        mergearrays();
    }

    static int[] mergearrays() {
        while (index < sortedarray.length) {
            if (arr1index >= arr1.length) {
                sortedarray[index] = arr2[arr2index];
                arr2index++;
            } else if (arr2index >= arr2.length) {
                sortedarray[index] = arr1[arr1index];
                arr1index++;
            } else {
                if (arr1[arr1index] <= arr2[arr2index]) {
                    sortedarray[index] = arr1[arr1index];
                    arr1index++;
                } else {
                    sortedarray[index] = arr2[arr2index];
                    arr2index++;
                }
            }

            System.out.print(sortedarray[index]+ " ");
            index++;
        }
        return sortedarray;
    }

}
