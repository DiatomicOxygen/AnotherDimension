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

  public static int[] sumRows(int[][] matrix) {
    int[] sum = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      sum[i] = sum(matrix[i]);
    }
    return sum;
  }

  public static  int[] largestInRows(int[][] matrix) {
    int[] largestIntArr = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      largestIntArr[i] = largest(matrix[i]);
    }
    return largestIntArr;
  }

  public static int sum(int[][] arr) {
    int[] x = sumRows(arr);
    int sum = sum(x);
    return sum;
  }
}
