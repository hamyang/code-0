package 单链表;

import java.util.Stack;

public class singleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");
        HeroNode hero5 = new HeroNode(5, "浮动", "啊");
        HeroNode hero6 = new HeroNode(6, "华人", "解码");
        HeroNode hero7 = new HeroNode(7, "撒", "给");
        HeroNode hero8 = new HeroNode(8, "预热", "发方");
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        // singleLinkedList.add(hero1);
        // singleLinkedList.add(hero2);
        // singleLinkedList.add(hero3);
        // singleLinkedList.add(hero4);
        singleLinkedList.addByOrder(hero3);
        singleLinkedList.addByOrder(hero2);
        singleLinkedList.addByOrder(hero4);
        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero5);
        singleLinkedList.addByOrder(hero6);
        singleLinkedList.addByOrder(hero7);
        singleLinkedList.addByOrder(hero8);
        singleLinkedList.list();
        //修改节点
        System.out.println("修改节点");
        HeroNode newHeroNode = new HeroNode(2, "hy", "yy");
        singleLinkedList.update(newHeroNode);
        singleLinkedList.list();
        //删除节点
        System.out.println("删除节点");
        singleLinkedList.del(1);
        singleLinkedList.list();
        //单链表的有效个数
        System.out.println("单链表的有效个数");
        System.out.println(getLength(singleLinkedList.getHead()));
        //倒数第k个节点
        System.out.println("倒数第k个节点");
        HeroNode res = findLastIndexNode(singleLinkedList.getHead(), 1);
        System.out.println(res);

        //单链表反转迭代解法
        System.out.println("单链表反转迭代解法");
        HeroNode temp = reversedList(hero1);
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
        // 单链表反转递归解法
        System.out.println("单链表反转递归解法");
        HeroNode temp2 = reversedList2(hero1);
        while (temp2 != null) {
            System.out.println(temp2);
            temp2 = temp2.next;
        }
        // 逆向输出单链表
        System.out.println("逆向输出单链表");
        reversePrint(hero5);
    }

    // 获取单链表节点个数

    /**
     * @param head 链表的头节点
     * @return 返回的就是有效节点个数
     */
    public static int getLength(HeroNode head) {

        if (head.next == null) {
            return 0;
        }
        int length = 0;
        HeroNode cur = head.next;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        return length;
    }
/**
 * @return 返回cur
 */
    // 查找单链表倒数第k个节点
    public static HeroNode findLastIndexNode(HeroNode head, int index) {
        if (head.next == null) {
            System.out.println("链表为空");
        }
        int size = getLength(head);
        if (index <= 0 || index > size) {
            return null;
        }
        HeroNode cur = head.next;
        for (int i = 0; i < size - index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    // 单链表反转迭代解法
    public static HeroNode reversedList(HeroNode head) {
        // 地址 ，初始为空内容，以后赋值为地址
        HeroNode prev = null;
        // 地址 ，初始为头
        HeroNode curr = head;
        while (curr != null) {
            // 取出隔离
            HeroNode next = curr.next;
            // 使其指向新链表，断开旧链表
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    //单链表反转递归解法
    public static HeroNode reversedList2(HeroNode head) {
        if (head == null || head.next == null) {
            //传入什么就以什么为head
            return head;
        }
        //需要注意执行递归方法，类似于栈，无需手动自动出栈,本行代码仅存
        HeroNode newHead = reversedList2(head.next);

        //head是箭头
        head.next.next = head;
        //防止成为循环链表
        head.next = null;

        return newHead;
    }

    /**
     * @author <a href="HAM"
     */
    //逆向输出单链表
    public static void reversePrint(HeroNode head) {
        if (head.next == null) {
            return;
        }
        //创建栈
        Stack<HeroNode> stack = new Stack<HeroNode>();
        HeroNode cur = head.next;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
}

class SingleLinkedList {
    //初始化节点
    private final HeroNode head = new HeroNode(0, "", "");

    public HeroNode getHead() {
        return head;
    }

    //添加链表
    public void add(HeroNode heroNode) {
        //有一个temp指向头节点
        HeroNode temp = head;
        //遍历链表找到最后
        while (temp.next != null) {
            //如果没有找到temp后移
            temp = temp.next;
        }
        //将最后这节点连上新的节点
        temp.next = heroNode;
    }

    //根据排名添加到指定位置
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

    //修改节点信息
    public void update(HeroNode newHeroNode) {
        if (head.next == null) {
            System.out.println("链表为空");
        }
        HeroNode temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.no == newHeroNode.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.nickname;
        } else {
            System.out.printf("没有找到编号%d的节点，不能修改\n", newHeroNode.no);
        }
    }

    // 删除节点信息
    public void del(int no) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.println("要删除的节点不存在");
        }
    }

    // 输出链表
    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }
}

class HeroNode {
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;

    // 构造器
    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" + "no=" + no + ", name='" + name + '\'' + ", nickname='" + nickname + '\'' + '}';
    }
}

