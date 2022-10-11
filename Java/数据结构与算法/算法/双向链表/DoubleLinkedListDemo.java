package 双向链表;

public class DoubleLinkedListDemo {
    public static void main(String[] args) {

        HeroNode2 hero1 = new HeroNode2(1, "宋江", "及时雨");
        HeroNode2 hero2 = new HeroNode2(2, "卢俊义", "玉麒麟");
        HeroNode2 hero3 = new HeroNode2(3, "吴用", "智多星");
        HeroNode2 hero4 = new HeroNode2(4, "林冲", "豹子头");
        HeroNode2 hero5 = new HeroNode2(5, "浮动", "啊");
        DoubleLinklist doubleLinklist = new DoubleLinklist();
        doubleLinklist.add(hero1);
        doubleLinklist.add(hero2);
        doubleLinklist.add(hero3);
        doubleLinklist.add(hero4);
        doubleLinklist.add(hero5);
        doubleLinklist.list();

        //修改
        System.out.println("修改后双向链表");
        HeroNode2 newHeroNode = new HeroNode2(4,"aa","bb");
        doubleLinklist.update(newHeroNode);
        doubleLinklist.list();

        //删除
        System.out.println("删除后的节点信息");
        doubleLinklist.del(3);
        doubleLinklist.list();

    }
}

//创建双向链表
class DoubleLinklist {
    //创建头节点
    private HeroNode2 head = new HeroNode2(0, "", "");

    public HeroNode2 getHead() {
        return head;
    }

    //遍历双向链表
    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode2 temp = head.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    //添加链表
    public void add(HeroNode2 heroNode) {
        //有一个temp指向头节点
        HeroNode2 temp = head;
        //遍历链表找到最后
        while (temp.next != null) {
            //如果没有找到temp后移
            temp = temp.next;
        }
        //将最后这节点连上新的节点
        temp.next = heroNode;
        heroNode.pre = temp;
    }

    //修改节点信息
    public void update(HeroNode2 newHeroNode) {
        if (head.next == null) {
            System.out.println("链表为空");
        }
        HeroNode2 temp = head.next;
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

    //删除节点信息
    public void del(int no) {
        if (head.next == null) {
            System.out.println("链表为空无法删除");
            return;
        }
        HeroNode2 temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.pre.next = temp.next;
            if (temp.next != null) {
                temp.next.pre = temp.pre;
            }
        } else {
            System.out.println("要删除的节点不存在");
        }
    }
}

class HeroNode2 {
    public int no;
    public String name;
    public String nickname;
    public HeroNode2 next;
    public HeroNode2 pre;

    //构造器
    public HeroNode2(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" + "no=" + no + ", name='" + name + '\'' + ", nickname='" + nickname + '\'' + '}';
    }
}
