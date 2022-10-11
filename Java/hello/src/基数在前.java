import java.util.Arrays;
public class 基数在前 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array1 = new int[9];//基数
        int[] array2 = new int[9];//偶数
        int arr = 0;
        int arr2 =0;
        for (int j : array) {
            if (j % 2 != 0) {
                array1[arr] = j;
                arr++;
            }
            if (j % 2 == 0) {
                array2[arr2] = j;
                arr2++;
            }
        }
        for (int i = 0; i < array.length-5; i++) {
                array1[array.length-5+i+1] = array2[i];
        }
        System.out.println(Arrays.toString(array1));
    }
}
