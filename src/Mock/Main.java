package Mock;

public class Main {

//    private static Main main;
//
//    private Main(){
//
//    }
//
//    public static Main getInstance() {
//
//        if (main != null) {
//            synchronized (Main.class) {
//                if (main != null) {
//                    main = new Main();
//                }
//            }
//        }
//        return main;
//    }

    public static void main(String[] args) {
        /*
        *   Rearrange array in alternating positive & negative items,
            arrange them in an alternate fashion such that every positive number is
            followed by a negative and vice-versa maintaining the order of appearance.

                I/P :- 1, 2, 3, -4, -1, 4
                O/P :- -4, 1, -1, 2, 3, 4
        * */
        int arr[] = new int[]{1, 2, 3, -4, -1, 4 };
        arr = rearrangeElements(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    private static int[] rearrangeElements(int[] arr) {
        int p1 = 0;
        int p2 = 0;
        int c = 0;
        int[] ans = new int[arr.length];

        while(p1 < arr.length && p2 < arr.length){
            if(arr[p1] < 0 && c % 2 == 0){
                ans[c] = arr[p1];
                p1+=2;
                c++;
            }
            else if(arr[p2] < arr.length && c % 2 == 1){
                ans[c] = arr[p2];
                p2+=2;
                c++;
            }
        }

        while(p1 < arr.length){
            if(arr[p1] < 0){
                ans[c] = arr[p1];
                p1++;
                c++;
            }
        }

        while(p2 < arr.length){
            if(arr[p2] > 0){
                ans[c] = arr[p2];
                p2++;
                c++;
            }
        }
        return ans;
    }
}
