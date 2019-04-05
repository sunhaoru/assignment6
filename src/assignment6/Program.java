package assignment6;

public class Program {
  // Cite:
  // https://www.google.com/search?client=firefox-b-1-e&ei=h2qmXJiMKqrejwS3-LD4AQ&q=abs+in+java&oq=abs+in+java&gs_l=psy-ab.3..0i203l4j0i30j0i5i30j0i12i5i10i30j0i5i30.7469.8494..9047...0.0..0.112.636.7j1......0....1..gws-wiz.......0i71j0i67j0i12j0j0i10i30.LvjNXvzGBlg
  /**
   * contains method takes three parameters, and return true if there is a element dubs[i] in the
   * array such that abs(dubs[i] - d) < eps.
   * 
   * @param dubs A double array
   * @param eps A double value
   * @param d A double value
   * @return boolean value
   */
  public static boolean contains(double[] dubs, double eps, double d) {
    for (int i = 0; i < dubs.length; i++) {
      if (java.lang.Math.abs(dubs[i] - d) < eps) {
        return true;
      } // if
    } // for
    return false;
  }// contains

  /**
   * fastModExp method takes three integers, x, y, and m and returns x^y mod m.
   * 
   * @param x An integer
   * @param y An integer
   * @param m An integer
   * @return x^y mod m
   */
  public static int fastModExp(int x, int y, int m) {
    if (y % 2 == 0) {
      int temp = (x * x) % m;
      for (int i = 0; i < y / 2; i++) {
        temp *= temp;
      } // for
      return temp % m;
    } else {
      int temp = x;
      for (int j = 0; j < y - 1; j++) {
        temp *= temp;
      } // for
      temp = temp % m;
      return (x * temp) % m;
    } // else
  }// fastModExp

  /**
   * allPairs takes an integer array and returns all possible pairs of elements from the input array
   * in a new array of type IntPair array.
   * 
   * @param arr An integer array
   * @return IntPair array
   * @throws Exception IllegalArgumentException if arr == null
   */
  public static IntPair[] allPairs(int[] arr) throws Exception {
    if (arr == null) {
      throw new IllegalArgumentException("The input array is null.");
    } // throw exception

    int len = arr.length;
    IntPair[] val = new IntPair[len * len];
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len; j++) {
        val[i + j] = new IntPair(arr[i], arr[j]);
      } // for
    } // for
    return val;
  }// allPairs

  // Cite
  // https://stackoverflow.com/questions/12899953/in-java-how-to-append-a-string-more-efficiently
  /**
   * concatAndReplicateAll takes an array of strings and an integer n and returns a single string
   * that is the result of replicating them all n times and then concatenating them all together.
   * 
   * @param arr A string array
   * @param n An integer
   * @return a string array
   * @throws Exception IllegalArgumentException if arr == null
   */
  public static String concatAndReplicateAll(String[] arr, int n) throws Exception {
    if (arr == null) {
      throw new IllegalArgumentException("The input array is null.");
    } // throw exception

    StringBuilder val = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < n; j++) {
        val.append(arr[i]);
      } // for
    } // for
    return val.toString();
  }// concatAndReplicateAll

  /**
   * interleave takes two arrays of integers and returns a third array that is the result of
   * interleaving the first array with the second.
   * 
   * @param arr1 Integer array
   * @param arr2 Integer array
   * @return integer array
   */
  public static int[] interleave(int[] arr1, int[] arr2) {
    int len = arr1.length + arr2.length;
    int[] val = new int[len];

    if (arr1.length < arr2.length) {
      for (int i = 0; i / 2 < arr1.length; i += 2) {
        val[i] = arr1[i / 2];
        val[i + 1] = arr2[i / 2];
      } // for
      for (int k = 0; k < len - arr1.length * 2; k++) {
        val[k + arr1.length * 2] = arr2[k + arr1.length];
      } // for
    } // if
    else {
      for (int i = 0; i / 2 < arr2.length; i += 2) {
        val[i] = arr1[i / 2];
        val[i + 1] = arr2[i / 2];
      } // for
      for (int l = 0; l < len - arr2.length * 2; l++) {
        val[l + arr2.length * 2] = arr1[l + arr2.length];
      } // for
    } // else
    return val;
  }
}
