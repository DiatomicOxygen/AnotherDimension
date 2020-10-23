public class ArrayOps {
  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static  int largest(int[] arr) {
    int largestInt = -1000000;
    for (int i = 0; i < arr.length; i++) {
      largestInt = Math.max(largestInt, arr[i]);
    }
    return largestInt;
  }

}
