package 字符流.复制文件夹;
import java.io.*;
public class 复制多级文件夹 {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("D:\\itcast_1");
        File destFile = new File("D:\\code\\Java\\File");
        copyFolder(srcFile, destFile);
    }
    //    复制文件夹
    private static void copyFolder(File srcFile, File destFile) throws IOException {
//        判断数据源是否是目录
        if (srcFile.isDirectory()) {
//            在目的地下创建和数据源File名称一样的目录
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile, srcFileName);
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }
//            获取数据源File下所有文件或者目录的File数组
            File[] fileArray = srcFile.listFiles();
//            遍历该File数组，得到每一个File对象
            for (File file : fileArray) {
                copyFolder(file, newFolder);
            }
        } else {
//            说明是文件，直接复制
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile, newFile);
        }
    }
    //    字节缓冲流负复制文件
    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bos.close();
        bis.close();
    }
}