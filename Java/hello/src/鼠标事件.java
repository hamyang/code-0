import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class 鼠标事件 {
    public static void main(String[] args) {
        new MYML();
    }
}

class MYML implements MouseListener {
    Frame f = new Frame("MouseEvent");
    public MYML(){
        f.setLayout(new FlowLayout());
        f.setSize(200,120);
        f.setLocation(300,200);
        f.setVisible(true);
        f.setBackground(Color.pink);
        Button but = new Button("Button");
        f.add(but);
        but.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("完成鼠标点击事件");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("鼠标按下事件");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("鼠标放下事件");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标进入按钮区事件");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标移出按钮区事件");
    }
}
