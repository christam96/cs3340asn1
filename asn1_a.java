public class asn1_a {

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

      // Perform insertion sort on myList
      int[] arr2 = insertionSort(myList);

      // Print out first 20 integers of array after insertion sort
      for (int i = 0; i < 20; i++) {
        System.out.println(myList[i]);
      }

      /**
      * Case 2: j =  200000
      **/
      int j = 200000;
      //Create a reversely sorted integer array of size 20000
       int[] myList = new int[200001];
       for (int i = 0; i < 200000; i++) {
         myList[i] = j;
         j--;
       }

       // Print out first 20 integers of array before insertion sort
       for (int i = 0; i < 20; i++) {
         System.out.println(myList[i]);
       }

       // Perform insertion sort on myList
       int[] arr2 = insertionSort(myList);

       // Print out first 20 integers of array after insertion sort
       for (int i = 0; i < 20; i++) {
         System.out.println(myList[i]);
       }

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
