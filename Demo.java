public class Demo {
    public static void main(String[] args) {
      if (args.length > 0) {
        printLoop(Integer.parseInt(args[0]));
      } else {
        printLoop(5);
      }
      /*
      int[] a = {1, 3, 5, 6};
      int[][] b = {{1, 3, 5, 6}, {1, 3, 6}, {1, 3}, {}};
      System.out.println(arrToString(a));
      System.out.println(arrayDeepToString(b));
      System.out.println(arrayDeepToString(b).replace("}, ", "}, \n "));
      System.out.println();

      int[][] c = create2DArray(10, 10, 10);
      System.out.println(arrayDeepToString(c).replace("}, ", "}, \n "));

      int[][] d = new int[0][10];
      System.out.println(arrayDeepToString(d));
      System.out.println();

      int[][] arr1 = create2DArrayRandomized(6, 5, 20);
      System.out.println(arrayDeepToString(arr1));
      System.out.println();

      int[][] arr2 = create2DArrayRandomized(4, 10, 100);
      System.out.println(arrayDeepToString(arr2).replace("}, ", "}, \n "));
      */
    }

    public static void printLoop(int n) {
      for (int i = 1; i<=n; i++) {
        for (int j = i; j<=n; j++) {
          System.out.print(i);
        }
        System.out.println();
      }
    }

    public static String arrToString(int[] arr) {
      if (arr.length==0) {
        return "{}";
      }
      String retstr = "{";
      for (int i = 0; i<arr.length-1; i++) {
        retstr += arr[i] + ", ";
      }
      return retstr+= arr[arr.length-1] + "}";
    }

    public static String arrayDeepToString(int[][] arr) {
      if (arr.length==0) {
        return "{}";
      }
      String retstr = "{";
      for (int i = 0; i<arr.length-1; i++) {
        retstr += arrToString(arr[i]) + ", ";
      }
      return retstr += arrToString(arr[arr.length-1])+"}";
    }

    public static int[][] create2DArray(int rows, int cols, int maxValue) {
      int[][] arr = new int[rows][cols];
      for (int row = 0; row<rows; row++) {
        for (int col= 0; col < cols; col++) {
          arr[row][col] = (int) Math.round(Math.random() * maxValue);
        }
      }
      return arr;
    }

    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
      int[][] arr = new int[rows][];
      for (int row = 0; row < rows; row++) {
        int randcols = (int) Math.round(Math.random() * cols);
        arr[row] = new int[randcols];
        for (int col = 0; col < randcols; col++) {
          arr[row][col] = (int) Math.round(Math.random() * maxValue);
        }
      }
      return arr;
    }
}
