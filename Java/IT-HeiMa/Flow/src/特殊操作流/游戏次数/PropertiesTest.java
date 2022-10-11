package 特殊操作流.游戏次数;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        //从文件中读取数据到Properties集合，用load()方法实现
        Properties prop = new Properties();
        FileReader fr = new FileReader("D:\\code\\Java\\File\\game.txt");
        prop.load(fr);//文件中的数据加载到集合中来
        fr.close();
        //通过集合Properties集合获取到玩游戏的次数
        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);
        if (number >= 3) {
            System.out.println("游戏试玩已结束，想玩请充值");
        } else {
            GuessNumber.start();//启动线程
            number++;
            prop.setProperty("count", String.valueOf(number));
            FileWriter fw = new FileWriter("D:\\code\\Java\\File\\game.txt");
            prop.store(fw, null);
            fw.close();
        }
    }
}
