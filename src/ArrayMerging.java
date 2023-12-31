import java.util.Arrays;

public class ArrayMerging {

    /*
    * Our startup has two databases containing important information, both sorted in non-decreasing order.
    * We need to efficiently merge the two databases into a single sorted array to process the data.
    * Can you write a function that takes in the two arrays and returns a merged array sorted in non-decreasing order?
    *
    * Example 1:
    *
    *   arr1 = {1, 3, 5, 7};
    *   arr2 = {2, 4, 6, 8};
    *   mergedArr should be {1, 2, 3, 4, 5, 6, 7, 8}
    *
    *
    * Example 2:
    *   arr1 = {1, 2, 3, 4};
    *   arr2 = {5, 6, 7, 8};
    *   mergedArr should be {1, 2, 3, 4, 5, 6, 7, 8}
    *
    * */

    public static void main(String[] args){

        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8};

        System.out.println(Arrays.toString(mergeSortedArrays(arr1,arr2)));
        arr1 = new int[]{1, 2, 3, 4};
        arr2 = new int[]{5, 6, 7, 8};

        System.out.println(Arrays.toString(mergeSortedArrays(arr1,arr2)));

        arr1 = new int[0];
        arr2 = new int[]{5, 6, 7, 8};

        System.out.println(Arrays.toString(mergeSortedArrays(arr1,arr2)));

        arr1 = new int[0];
        arr2 = new int[0];

        System.out.println(Arrays.toString(mergeSortedArrays(arr1,arr2)));


    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2){

        int aSize = arr1.length;
        int bSize = arr2.length;

        int[] msArray = new int[aSize + bSize];

        int i = 0;
        int j = 0;
        int index =0;

        while (i < aSize && j < bSize){

            if(arr1[i] <= arr2[j]){
                msArray[index++] = arr1[i++];
            }else{
                msArray[index++] = arr2[j++];
            }
        }

        while(i < aSize){
            msArray[index++] = arr1[i++];
        }
        while(j < bSize){
            msArray[index++] = arr2[j++];
        }

        return msArray;
    }
}
