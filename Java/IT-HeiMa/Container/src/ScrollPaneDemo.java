import java.awt.*;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("演示对象");

        // 参加一个Scrollpane对象
        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);//有滚动条
        // 往Scrollpane中添加内容
        sp.add(new TextField("测试文本"));
        sp.add(new Button("测试按钮"));
        // 把Scrollpane添加到Frame中
        frame.add(sp);
        frame.setBounds(100, 100, 500, 300);
        frame.setVisible(true);
    }
}
