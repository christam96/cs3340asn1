import java.util.*;

public class asn1_b {

   public static void main(String []args) {
     /**
     * Case 1: j =  20000
     **/
     int j = 20000;
     //Create a reversely sorted integer array of size 20000
      int[] myList = new int[20001];
      for (int i = 0; i < 20000; i++) {
        myList[i] = j;
        j--;
      }

      // Print out first 20 integers of array before insertion sort
      for (int i = 0; i < 20; i++) {
        System.out.println(myList[i]);
      }

      // Perform merge sort on myList
      performMergeSort(myList);

      // Print out first 20 integers of array after insertion sort
      for (int i = 0; i < 20; i++) {
        System.out.println(myList[i]);
      }

      /**
      * Case 2: j =  200000
      **/
      int m = 200000;
      //Create a reversely sorted integer array of size 20000
       int[] myList2 = new int[200001];
       for (int i = 0; i < 200000; i++) {
         myList2[i] = m;
         m--;
       }

       // Print out first 20 integers of array before insertion sort
       for (int i = 0; i < 20; i++) {
         System.out.println(myList2[i]);
       }

       // Perform merge sort on myList2
       performMergeSort(myList2);

       // Print out first 20 integers of array after insertion sort
       for (int i = 0; i < 20; i++) {
         System.out.println(myList2[i]);
       }

       /**
       * Case 3: j =  200000000
       **/
       int r = 200000000;
       //Create a reversely sorted integer array of size 20000
        int[] myList3 = new int[200000001];
        for (int i = 0; i < 200000000; i++) {
          myList3[i] = r;
          r--;
        }

        // Print out first 20 integers of array before insertion sort
        for (int i = 0; i < 20; i++) {
          System.out.println(myList3[i]);
        }

        // Perform merge sort on myList3
        performMergeSort(myList3);

        // Print out first 20 integers of array after insertion sort
        for (int i = 0; i < 20; i++) {
          System.out.println(myList3[i]);
        }
   }

   // Implement merge sort
   @SuppressWarnings("rawtypes")
    public static int[] performMergeSort(int[] list)
    {
        //If list is empty; no need to do anything
        if (list.length <= 8) {
            return list;
        }

        //Split the array in half in two parts
        int[] first = new int[list.length / 2];
        int[] second = new int[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        //Sort each half recursively
        performMergeSort(first);
        performMergeSort(second);

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


}
