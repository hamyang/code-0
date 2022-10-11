package File文件操作;

import java.io.File;

public class File类判断和获取功能 {
    public static void main(String[] args) {
        //创建一个File对象
        File f = new File("D:\\code\\Java\\File\\Java.txt");
        //public boolean isDirectory ():测试此抽象路径名表示的File是否为目录
        System.out.println(f.isDirectory());
        //public boolean isFile ():测试此抽象路径名表示的File是否为文件
        System.out.println(f.isFile());
        //public boolean exists ():测试此抽象路径名表示的File是否存在
        System.out.println(f.exists());
        //public String getAbsolutePath ():返回此抽象路径名的绝对路径名字符串
        System.out.println(f.getAbsolutePath());
        //public String getPath ():将此抽象路径名转换为路径名字符串
        System.out.println(f.getPath());
        //public String getName ():返回由此抽象路径名表示的文件或目录的名称System.out.println(f.getAbsolutePath());
        System.out.println(f.getName());
        System.out.println("--------");
        //public String[] list ():返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
        //public File[] listFiles():返回此抽象路径名表示的目录中的文件和目录的File对象数
        File f2 = new File("D:\\code\\Java\\File\\Java.txt");
        String[] strArray = f2.list();
        for (String str : strArray) {
            System.out.println(str);
        }
        System.out.println("-----");
        File[] fileArray = f2.listFiles();
        for (File file : fileArray) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
