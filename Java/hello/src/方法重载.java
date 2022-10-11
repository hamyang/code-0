public class 方法重载 {
    public static void main(String[] args) {

        System.out.println(arr(1, 2));
        System.out.println(arr(1, 2, 3));
        System.out.println(arr(1, 2, 3, 4));
    }

    public static int arr(int a, int b) {
        return a > b ? b : a;
    }

    public static int arr(int a, int b, int c) {
        if (a > b) {
            return b > c ? c : b;
        } else return a > c ? c : a;
    }

    public static int arr(int a, int b, int c, int d) {
        int x = 0;
        int y = 0;
        x = Math.min(a, b);
        y = Math.min(c, d);
        return Math.min(x, y);
    }

}
