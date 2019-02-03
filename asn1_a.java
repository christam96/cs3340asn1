public class asn1_a {

   /* This is my first java program.
    * This will print 'Hello World' as the output
    */

   public static void main(String []args) {
     int j = 20000;
     //Create a reversely sorted integer array of size 20000
      int[] myList = new int[20001];
      for (int i = 0; i < 20000; i++) {
        myList[i] = j;
        j--;
      }


      int[] arr2 = insertionSort(myList);


      // Print out first 20 integers of array before insertion sort
      for (int i = 0; i < 20; i++) {
        System.out.println(myList[i]);
      }
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
