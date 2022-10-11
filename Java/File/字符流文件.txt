public class Fibonacci数列 {
    public static void main(String[] args) {
        int[] array = new int[30];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < 30; i++) {
            array[i] = array[i-2]+array[i-1];
        }
        for (int i:array){
            System.out.println(i);
        }
    }
}
