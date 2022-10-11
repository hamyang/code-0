package 递归;

import java.io.File;

public class 递归遍历目录 {
    public static void main(String[] args) {
        File srcFile = new File("D:\\code\\Java");
        getAllFilepath(srcFile);
    }

    public static void getAllFilepath(File srcFile) {
        File[] fileArray = srcFile.listFiles();
        if (fileArray != null) {
            for (File file : fileArray) {
                if (file.isDirectory()) {
                    getAllFilepath(file);
                } else {
                    System.out.println(file.getAbsoluteFile());
                }
            }
        }
    }
}
