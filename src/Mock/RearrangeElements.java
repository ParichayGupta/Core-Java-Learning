package Mock;

public class RearrangeElements {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, -4, -1, 4};
        int[] ans = rearrangeElements(arr);

        for (int j : ans) {
            System.out.println(j);
        }
    }

    private static void rightRotate(int[] arr, int n, int outOfPlace, int cur) {
        int tmp = arr[cur];
        for (int i = cur; i > outOfPlace; i--)
            arr[i] = arr[i - 1];
        arr[outOfPlace] = tmp;
    }

    private static int[] rearrangeElements(int[] arr) {
        int n = arr.length;
        int outofplace = -1;

        for (int index = 0; index < n; index++) {
            if (outofplace >= 0) {

                if (((arr[index] >= 0) && (arr[outofplace] < 0)) ||
                        ((arr[index] < 0) && (arr[outofplace] >= 0))) {
                    rightRotate(arr, n, outofplace, index);

                    if (index - outofplace >= 2)
                        outofplace = outofplace + 2;
                    else
                        outofplace = -1;
                }
            }

            if (outofplace == -1) {
                if (((arr[index] >= 0)
                        && ((index & 0x01) == 0))
                        || ((arr[index] < 0)
                        && (index & 0x01) == 1))
                    outofplace = index;
            }
        }
        return arr;
    }
}
