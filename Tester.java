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
    System.out.println(x[0] + " " + x[1] + " " + x[2]);

    int[] y = ArrayOps.largestInRows(A);
    System.out.println(y[0] + " " + y[1] + " " + y[2]);


  }
}
