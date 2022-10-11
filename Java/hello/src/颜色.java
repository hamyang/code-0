public class 颜色 {
    public static void main(String[] args) {
        int num =23;
        System.out.println("\033[30;4m"+num);

        System.out.println("\033[0;30;2 \033[0m");
        colour("123");
    }
    public static void colour(Object co) {
        System.out.println("\033[30;4m" + co.toString() + "\033[0m");
        System.out.println("\033[31;4m" + co.toString() + "\033[0m");
        System.out.println("\033[32;4m" + co.toString() + "\033[0m");
        System.out.println("\033[33;4m" + co.toString() + "\033[0m");
        System.out.println("\033[34;4m" + co.toString() + "\033[0m");
        System.out.println("\033[35;4m" + co.toString() + "\033[0m");
        System.out.println("\033[36;4m" + co.toString() + "\033[0m");
        System.out.println("\033[37;4m" + co.toString() + "\033[0m");
        System.out.println();
        System.out.println("\033[40;31;4m" + co.toString() + "\033[0m");
        System.out.println("\033[41;32;4m" + co.toString() + "\033[0m");
        System.out.println("\033[42;33;4m" + co.toString() + "\033[0m");
        System.out.println("\033[43;34;4m" + co.toString() + "\033[0m");
        System.out.println("\033[44;35;4m" + co.toString() + "\033[0m");
        System.out.println("\033[45;36;4m" + co.toString() + "\033[0m");
        System.out.println("\033[46;37;4m" + co.toString() + "\033[0m");
        System.out.println("\033[47;4m" + co.toString() + "\033[0m");
    }
}



