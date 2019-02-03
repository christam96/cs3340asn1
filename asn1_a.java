public class asn1_a {

   /* This is my first java program.
    * This will print 'Hello World' as the output
    */

   public static void main(String []args) {
      int[] myList = new int[20001];
      //Create a reversely sorted integer array of size 20000
      for (int i = 20000; i > 0; i--) {
        int j = 0;
        myList[j] = i;
        j++;
      }

      // Print out size of array
      //System.out.println(myList.size());

      // Print out first 20 integers of array
      for (int i = 0; i < 20; i++) {
        System.out.println(myList[i]);
      }
   }
}
