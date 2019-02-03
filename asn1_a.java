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

      // Print out size of array
      //System.out.println(myList.size());

      // Print out first 20 integers of array
      for (int i = 0; i < 20; i++) {
        System.out.println(myList[i]);
      }
   }
}
