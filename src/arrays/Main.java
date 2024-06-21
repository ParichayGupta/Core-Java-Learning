package arrays;

public class Main {
    public static void main(String[] args) {
        /* jagged Array Example
            Jagged array is an 2D array, where we define the first main array size and keep all the 1D arrays
            empty.
            and manually give random size to all the 1D arrays within that 2D array.

            Simply a 2D array where size of all 1D array may be different.

            {
                {1,2,3},
                {4,5},
                {6,7,8,9,10}
            }
         */

        int[][] arr = new int[2][];
        arr[0] = new int[2];
        arr[1] = new int[5];

        for(int i = 0; i < arr.length; i++){
            System.out.println(i);
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
