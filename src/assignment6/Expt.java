package assignment6;

import java.util.Arrays;

public class Expt {

  public static void main(String[] args) throws Exception {
    int arr1[] = {0, 1, 2, 3, 5, 6, 7, 8};
    int arr2[] = {3, 4, 5};
    String[] arr = {"hello", "world", "!"};
    
    System.out.println(Arrays.toString(Program.interleave(arr1, arr2)));
    
    System.out.println(Program.fastModExp(2, 4, 10));
    
    System.out.println(Program.concatAndReplicateAll(arr, 3));
    
  }//main
}
