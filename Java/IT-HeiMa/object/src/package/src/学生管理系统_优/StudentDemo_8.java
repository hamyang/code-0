package 学生管理系统_优;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo_8 {
    /*
        1.用输出语句完成主界面的编写
        2.用Scanner实现键盘录入数据
        3.用switch语句完成操作的选择
        4.用循环完成再次回到主界面
    */
    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据
        ArrayList<Student_8> array = new ArrayList<>();
        //用循环再次回到主界面
        while (true) {
            //主界面
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择:");

            //用Scanner录入数据
            Scanner sc = new Scanner(System.in);
            final String line = sc.nextLine();

            //用switch语句完成操作的选择
            switch (line) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent_8(array);
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deletsStudent(array);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    //System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("退出");
                    System.exit(0);//jvm退出
            }
        }
    }

    //定义一个方法，用于添加学生信息
    public static void addStudent_8(ArrayList<Student_8> array) {
        //键盘输入学生对象所需要的数据，显示提示信息，提示要输入何种信息
        String sid;//用于判断学生学号是否重复
        Scanner sc = new Scanner(System.in);
        //为了让程序能够回到这里，我们使用循环实现
        while (true) {
            System.out.println("请输入学生学号");
            sid = sc.nextLine();
            final boolean flag = isUsed(array, sid);//isUsed是我们定义的一个方法判断输入数据是否重合
            if (flag) {
                System.out.println("你输入的学号已经被使用请从新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入学生姓名");
        final String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        final String age = sc.nextLine();
        System.out.println("请输入学生居住地");
        final String address = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student_8 s = new Student_8();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        //将学生对象添加到集合中
        array.add(s);
        //添加成功提示
        System.out.println("添加学生成功");
    }

        //定义一个方法，判断学号是否被使用
    public static boolean isUsed(ArrayList<Student_8> array, String sid) {
        //如果与集合中的某一个学生学号相同，返回true；如果都不相同，返回false
        boolean flag = false;
        for (Student_8 s : array) {//利用增强for循环遍历array中的元素
            if (s.getSid().equals(sid)) {//equals关键字,比较两个对象的的内存地址
                flag = true;
                break;
            }
        }
        return flag;
    }

    //定义一个方法，用于查看学生信息
    public static void findAllStudent(ArrayList<Student_8> array) {
        //判断集合中是否有数据，如果没有显示提示信息
        if (array.size() == 0) {
            System.out.println("无信息请先添加信息再查询");
            //为了让程序不再往下执行
            return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");
        //将集合中的数据取出按照对应格式显示学生信息
        for (final Student_8 s : array) {
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "岁\t\t" + s.getAddress());
        }
    }

    //定义一个方法，用于删除学生信息
    public static void deletsStudent(ArrayList<Student_8> array) {
        //键盘录入要删除的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号");
        final String sid = sc.nextLine();
        //在删除/修改学生操作前，对学号是否存在进行判断
        //如果不存在，显示提示信息
        //如果存在，执行删除/修改操作
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            final Student_8 s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在，请从新输入");
        } else {
            array.remove(index);//remove关键字,删除在指定的元素
            //给出删除成功提示
            System.out.println("删除学生成功");
        }
        //遍历集合将对应学生对象从集合中删除
        for (int i = 0; i < array.size(); i++) {
            final Student_8 s = array.get(i);
            if (s.getSid().equals(sid)) {
                array.remove(i);
                break;
            }
        }
    }

    //定义一个方法，用于修改学生信息
    public static void updateStudent(ArrayList<Student_8> array) {
        //键盘录入要修改的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生学号:");
        final String sid = sc.nextLine();
        System.out.println("请输入学生新姓名");
        final String name = sc.nextLine();
        System.out.println("请输入学生新年龄");
        final String age = sc.nextLine();
        System.out.println("请输入学生新居住地");
        final String address = sc.nextLine();
        //创建学生对象
        Student_8 s = new Student_8();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        //遍历集合修改对应学生信息
        for (int i = 0; i < array.size(); i++) {
            Student_8 student_8 = array.get(i);
            if (student_8.getSid().equals(sid)) {
                array.set(i, s);
                break;
            }
        }
        System.out.println("修改学生成功");
    }
}

