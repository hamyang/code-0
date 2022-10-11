import java.util.Scanner;

/**
 * @author HAM
 */
public class 约瑟夫问题 {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1, "小明");
        HeroNode hero2 = new HeroNode(2, "小红");
        HeroNode hero3 = new HeroNode(3, "小芳");
        HeroNode hero4 = new HeroNode(4, "小李");
        HeroNode hero5 = new HeroNode(5, "小白");
        HeroNode hero6 = new HeroNode(6, "小黑");
        singleLinkedList singleLinkedList = new singleLinkedList();
        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero2);
        singleLinkedList.addByOrder(hero3);
        singleLinkedList.addByOrder(hero4);
        singleLinkedList.addByOrder(hero5);
        singleLinkedList.addByOrder(hero6);
        //连接首尾
        singleLinkedList.connection(hero1);
        singleLinkedList.list();
        System.out.println("----");
        //n=6人，从k=1开始数m次
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数的次数m=");
        int m = sc.nextInt();
        singleLinkedList.realize(hero1, m);
    }
}

class singleLinkedList {
    private final HeroNode head = new HeroNode(0, "");

    public HeroNode getHead() {
        return head;
    }

    //有序添加
    public void addByOrder(HeroNode heroNode) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no > heroNode.no) {
                break;
            } else if (temp.next.no == heroNode.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.printf("准备加入的英雄编号%d已经存在，不能加入\n", heroNode.no);
        } else {
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }
    // 输出链表
    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        while (head.next != temp.next) {
            System.out.println(temp);
            temp = temp.next;
        }
        // 补发
        System.out.println(temp);
    }

    // 连接首尾
    public void connection(HeroNode head) {
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                temp.next = head;
                break;
            }
            temp = temp.next;
        }
    }

    /**
     * @author HAM
     **/
    //实现
    public static void realize(HeroNode head, int m) {
        int c = m;
        // 前一个
        HeroNode first = head;
        // 后一个
        HeroNode helper = first;
        int size = singleLinkedList.getLength(first);
        // 找到最后一个,只需执行一次
            while (size > 1) {
                helper = helper.next;
                size--;
        }
        // 主函数
        while (true) {
            if (first == first.next) {
                System.out.println(first);
                break;
            }
            // 重新赋值前一个
            HeroNode first2 = first;
            // 重新赋值后一个
            HeroNode helper2 = helper;
            // 移动
            while (c > 1) {
                first = first2.next;
                helper = helper2.next;
                c--;
            }
            // 输出
            System.out.print(first + "->");
            // 后一个连接新的前一个
            helper.next = first.next;
            first = first.next;
            c=m;
        }
    }

    //获取元素个数
    public static int getLength(HeroNode first) {

        int length = 1;
        HeroNode cur2 = first.next.next;
        while (first.next.no != cur2.no) {
            length++;
            cur2 = cur2.next;
        }
        return length;
    }
}

class HeroNode {
    public int no;
    public String name;
    public HeroNode next;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HeroNode{" + "no=" + no + ", name='" + name + '\'' + '}';
    }
}
