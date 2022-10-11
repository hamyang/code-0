package 字符流.复制文件夹;

import java.io.*;
import java.util.Arrays;

public class 复制单级文件夹 {
    public static void main(String[] args) throws IOException {
//        获取数据源目录File名称
        File srcFolder = new File("D:\\code\\Java\\itcast");
//        获取数据源目录File对象名称
        String srcFolderName = srcFolder.getName();
//        创建目的地目录File对象
        File destFolder = new File("D:\\code\\Java\\File",srcFolderName);
//        判断目的地目录对应的File是否存在，如果不存在就创建
        if (!destFolder.exists()){
            destFolder.mkdir();
        }
//        获取数据源目录下所有文件的File数组
        File[] ListFiles = srcFolder.listFiles();
//        遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
        for (File srcFile:ListFiles){
//            数据源文件：D:\\itcast\\.jpg
//            获取数据源文件对象名称(.jpg)
            String srcFileName = srcFile.getName();
//            创建目的地文件File对象路径名是目的地目录+。jpg组成
            File destFile = new File(destFolder,srcFileName);
//            复制文件
            copyFile(srcFile,destFile);
        }
    }
    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }
}
