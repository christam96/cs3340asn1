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
      int[] arr2 = sort(myList);

      // Print out first 20 integers of array after insertion sort
      for (int i = 0; i < 20; i++) {
        System.out.println(myList[i]);
      }
   }

   // Implement merge sort
   public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }


}
