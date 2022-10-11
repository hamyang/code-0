import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.*;
public class Main2 {

    public static void main(String[] args) {
        File mfile = new  File("D:\\迅雷下载\\shadowscan_9343.rar");
        try {
            ZipFile zipFile = new  ZipFile(mfile);
            InputStream in=new BufferedInputStream(new FileInputStream(mfile));
            ZipInputStream zin=new ZipInputStream(in);
            ZipEntry ze;
            ze=zin.getNextEntry();
            System.out.println("ZIP'Size is :" + ze.getSize());
        }catch (Exception  e)
        {
            e.getStackTrace();
        }

    }
}
