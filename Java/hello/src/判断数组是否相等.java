public class 判断数组是否相等 {
    public static void main(String[] args) {
        int a = 0;//a为array1的长度
        int b = 0;//b为array2的长度
        int s1;//存储array1单元
        int s2;//存储array2单元
        int[] array1 = {22, 44, 11, 33, 55};
        int[] array2 = {66, 22, 33, 11, 55};
        a = array1.length;
        b = array2.length;
        if (a != b) {
            System.out.println("不相等");
            System.exit(1);
        }
        for (int i1 = 0; i1 < array1.length; i1++) {
            s1 = array1[i1];
            for (int i2 = 0; i2 < array2.length; i2++) {
                s2 = array2[i2];
                if (s1 == s2) {
                    break;
                }
                if (i2 == array2.length - 1) {
                    System.out.println("不相等");
                    System.exit(1);       //如果i2自增到(array2.length - 1)都无法满足s1==s2将会执行该循环退出虚拟机，如果满足s1==s2将会执行break;跳出循环也就不会执行到该循环
                }
            }
        }
        System.out.println("相等");
    }
}
