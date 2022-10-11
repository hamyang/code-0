public class 食堂好评_方法2 {
    //    switch循环法
    public static void main(String[] args) {
        int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0;
        int[] answers = {3, 1, 2, 5, 4, 2, 2, 3, 4, 5, 1, 2, 3, 4, 2, 1, 3, 2, 4, 2};
        for (int i : answers) {
            switch (i) {
                case 1: a1++;
                    break;
                case 2: a2++;
                    break;
                case 3: a3++;
                    break;
                case 4: a4++;
                    break;
                case 5: a5++;
                    break;
            }
        }
        System.out.print("分值\t\t");
        for (int i=1;i<6;i++){
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("学生数\t"+a1+"\t"+a2+"\t"+a3+"\t"+a4+"\t"+a5+"\t");
    }
}
