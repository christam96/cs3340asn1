import java.util.*;

public class asn1_c {

   public static void main(String []args) {
        /**
        * Case 1: r =  200000000
        **/
        // int r = 200000000;
        int k = 2;

        for (int n = 0; n < 6; n++) {
          System.out.println("Iteration for when k = ");
          System.out.println(k);

          //Create a reversely sorted integer array of size 2000000000
          int r = 200000000;
          int[] myList = new int[200000001];
          for (int i = 0; i < 200000000; i++) {
            myList[i] = r;
            r--;
          }

          // Print out first 20 integers of array before insertion sort
          for (int i = 0; i < 20; i++) {
            System.out.println(myList[i]);
          }

          // Perform merge sort on myList3
          performMergeSort(myList, k);

          // Print out first 20 integers of array after insertion sort
          for (int i = 0; i < 20; i++) {
            System.out.println(myList[i]);
          }

          k = k*k;
        }



   }

   // Implement merge sort
   @SuppressWarnings("rawtypes")
    public static int[] performMergeSort(int[] list, int k)
    {
        //If list is empty; no need to do anything
        if (list.length <= k) {
            int[] arr2 = insertionSort(list);
            return list;
        }

        //Split the array in half in two parts
        int[] first = new int[list.length / 2];
        int[] second = new int[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        //Sort each half recursively
        performMergeSort(first, k);
        performMergeSort(second, k);

        //Merge both halves together, overwriting to original array
        merge(first, second, list);
        return list;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static void merge(int[] first, int[] second, int[] result)
    {
        //Index Position in first array - starting with first element
        int iFirst = 0;

        //Index Position in second array - starting with first element
        int iSecond = 0;

        //Index Position in merged array - starting with first position
        int iMerged = 0;

        //Compare elements at iFirst and iSecond,
        //and move smaller element at iMerged
        while (iFirst < first.length && iSecond < second.length)
        {
            if (first[iFirst] < second[iSecond])
            {
              result[iMerged] = first[iFirst];
              iFirst++;
            }
            else
            {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        //copy remaining elements from both halves - each half will have already sorted elements
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
    }

    // Implement insertion sort
    public static int[] insertionSort(int[] input){
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}
