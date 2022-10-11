public class 学生成绩项目 {
    public static void main(String[] args) {
        float[] courseScore = {78, 80, 60, 90, 59};
        String[] courseName = {"计算机导论", "Java语言程序设计", "高等数学", "大学英语", "数据结构"};
        float sum = 0;
        System.out.println("你的成绩如下：");
        for (int i = 0; i < courseScore.length; i++) {
            sum += courseScore[i];
            if (courseScore[i] < 60) {
                System.out.println(courseName[i] + "：" + courseScore[i] + "分不及格");
            } else {
                System.out.println(courseName[i] + "：" + courseScore[i] + "分不及格");
            }
            System.out.println("你的平均分"+sum/courseScore.length);
        }
    }
}