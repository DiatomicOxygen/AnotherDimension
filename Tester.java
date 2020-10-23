public class Tester {
  public static void main(String[] args) {
    int[] a = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      a[i] += Integer.parseInt(args[i]);
    }
    System.out.println(ArrayOps.sum(a));

    System.out.println(ArrayOps.largest(a));

    int[][]  A  =  {  {  1,  0, 12, -1 },
                      {  7, -2,  2,  1 },
                      { -5, -2,  2, -9 }
                   };

    int[] x = ArrayOps.sumRows(A);
    System.out.println(arrToString(x));

    int[] y = ArrayOps.largestInRows(A);
    System.out.println(arrToString(y));

    System.out.println(ArrayOps.sum(A));

    int[] z = ArrayOps.sumCols(A);
    System.out.println(arrToString(z));

    int[][] B = {{1,  2, 3, 4 },
                {  2, 3,  4,  1},
                { 3, 4,  1, 2 } };

    int[][] C = { {  1,  1, 1 },
                {  2, 2, 2 },
                { 3,  3, 3 } };

    int[][] D = { {  2,  2, 2 },
                {  2, 2, 2 } };

    System.out.println(ArrayOps.isRowMagic(B));
    System.out.println(ArrayOps.isRowMagic(C));
    System.out.println(ArrayOps.isRowMagic(D));
  }

  public static String arrToString(int[] arr){
    String a = "{";
    for (int i = 0; i < arr.length; i++) {
      a += arr[i];
      if (i != arr.length - 1) {
        a += ", ";
      }
    }
    a += "}";
    return a;
  }
}
