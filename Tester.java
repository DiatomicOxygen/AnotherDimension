public class Tester {
  public static void main(String[] args) {

    int[] S = {  1, 3, 5 };

    //4a method test
    System.out.println(ArrayOps.sum(S));

    //4b method test
    System.out.println(ArrayOps.largest(S));

    int[][]  A  =  {  {  1,  0, 12, -1 },
                      {  7, -2,  2,  1 },
                      { -5, -2,  2, -9 }
                   };
    //4c method test
    int[] x = ArrayOps.sumRows(A);
    System.out.println(arrToString(x));

    //4d method test
    int[] y = ArrayOps.largestInRows(A);
    System.out.println(arrToString(y));

    //4e method test
    System.out.println(ArrayOps.sum(A));

    //5a method test
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

    //5b method test
    System.out.println(ArrayOps.isRowMagic(B));
    System.out.println(ArrayOps.isRowMagic(C));
    System.out.println(ArrayOps.isRowMagic(D));

    //5c method test
    System.out.println(ArrayOps.isColMagic(B));
    System.out.println(ArrayOps.isColMagic(C));
    System.out.println(ArrayOps.isColMagic(D));

    //5d method test
    int[][] E = { {  2,  4, 2 },
                { 2, 2, 2 } };

    System.out.println(ArrayOps.isLocationMagic(E, 0, 1));
    System.out.println(ArrayOps.isLocationMagic(E, 1, 1));

  }

  //I couldn't get Arrays.toString() to work, so I just copied the arrToString method from Demo.java
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
