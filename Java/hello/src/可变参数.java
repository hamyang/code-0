public class 可变参数 {
    public static void main(String[] args) {
        System.out.println(num(1,2,3,4,5,6));
    }
    public static int num(int... num1){
        int result=0;
        for (int j : num1) {
            result += j;
        }
        return result;
    }
}
