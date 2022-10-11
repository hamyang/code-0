package 储存学生对象;
import java.util.ArrayList;

public class StudentDemo_7 {
    public static void main(String[] args) {

        //创建集合对象
        ArrayList<Student_7> array = new ArrayList<>();
        //创建学生对象
        Student_7 s1 = new Student_7("林青霞", 19);
        Student_7 s2 = new Student_7("黄洋", 19);
        Student_7 s3 = new Student_7("罗德尼", 34);
        //添加学生对象到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);
        //遍历集合
        for (final Student_7 s : array) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
