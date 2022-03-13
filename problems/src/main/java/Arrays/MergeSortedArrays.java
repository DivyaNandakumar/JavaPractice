package Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 5, 9, 67,71,77, 89};
able
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
