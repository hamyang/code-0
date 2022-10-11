import java.awt.*;

public class Window {
    public static void main(String[] args) {


        // 创建一个window对象，因为panel以及其他容器不能单独存在，必须依附于window存在
        Frame frame = new Frame("创建一个窗口");
        frame.setBackground(new Color(142, 142, 32));
        frame.setBounds(600, 600, 600, 200);
        frame.add(new Button("a"));
        frame.setVisible(false);
        // 创建一个panel对象
        Panel p = new Panel();
        // 创建一个文本框和一个按钮，并且把他们放入到panel容器中
        p.add(new TextField("这里是一个测试文本"));
        p.add(new Button("An"));
        p.add(new Button("An"));
        p.add(new TextField());
        // 把panel放入到window中
        frame.add(p);
        // 设置window的位置大小
        frame.setBounds(600, 400, 500, 300);
        // 设置window可见
        frame.setVisible(true);
    }
}
