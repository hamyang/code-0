import java.util.Scanner;

public class 哈希表 {
    public static void main(String[] args) {
        HashTab hashTab = new HashTab(7);
        String key;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("add:添加雇员");
            System.out.println("list:显示雇员");
            System.out.println("find:查找雇员");
            System.out.println("exit:退出系统");
            key = scanner.next();
            switch (key) {
                case "add":
                    System.out.println("输入id");
                    int id = scanner.nextInt();
                    System.out.println("输入雇员姓名");
                    String name = scanner.next();
                    // 创建雇员
                    Emp emp = new Emp(id, name);
                    hashTab.add(emp);
                    break;
                case "list":
                    hashTab.list();
                    break;
                case "find":
                    System.out.println("请输入要查找的id");
                    int nextInt = scanner.nextInt();
                    hashTab.findEmpById(nextInt);
                case "exit":
                    scanner.close();
                    System.exit(0);
                default:
                    break;
            }

        }
    }
}

// 创建HashTab
class HashTab {
    private final EmpLinkedList[] empLinkedListsArray;
    private final int size;// 表示有多少条链表

    // 构造器
    public HashTab(int size) {
        this.size = size;
        // 初始化 empLinkedListsArray
        empLinkedListsArray = new EmpLinkedList[size];
        // 解决空指针异常
        for (int i = 0; i < size; i++) {
            empLinkedListsArray[i] = new EmpLinkedList();
        }
    }

    // 添加雇员(emp)
    public void add(Emp emp) {
        // 根据ID,使用散列函数，得到员工应当添加到哪条链表
        int empLinkedListNO = hashFun(emp.id);
        // 将emp 添加到对应的链表中
        empLinkedListsArray[empLinkedListNO].add(emp);
    }

    // 遍历哈希表
    public void list() {
        for (int i = 0; i < size; i++) {
            empLinkedListsArray[i].list(i);
        }
    }

    //根据输入的id查找雇员
    public void findEmpById(int id) {
        // 使用散列函数
        int empLinkedListNO = hashFun(id);
        Emp emp = empLinkedListsArray[empLinkedListNO].findEmpById(id);
        if (emp != null) {
            System.out.println("在第" + empLinkedListNO + "条链表找到该雇员");
        } else {
            System.out.println("在哈希表中，没有找到该雇员~");
        }
    }

    // 编写一个散列函数
    public int hashFun(int id) {
        return id % size;
    }
}


// emp表示一个雇员
class Emp {
    public int id;
    public String name;
    public Emp next;// 默认为空

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// 创建EmpLinkedList,表示链表
class EmpLinkedList {
    //头指针指向第一个Emp
    private Emp head;// 默认为null

    // 添加雇员
    public void add(Emp emp) {
        // 如果是第一个雇员
        if (head == null) {
            head = emp;
            return;
        }
        // 如果不是第一个雇员，则使用一个辅助的指针，帮助定位到最后
        Emp curEmp = head;
        // 说明到链表的最后
        while (curEmp.next != null) {
            curEmp = curEmp.next;// 向后移一位
        }
        // 退出时直接将emp加入链表
        curEmp.next = emp;
    }

    // 遍历链表的雇员信息
    public void list(int no) {
        if (head == null) {
            System.out.println("第" + no + "条链表为空");
            return;
        }
        System.out.print("第" + no + "条链表的信息为:");
        Emp curEmp = head;
        while (true) {
            System.out.printf("=>id = %d name = %s\t", curEmp.id, curEmp.name);
            if (curEmp.next == null) {// 说明curEmop已经是最后节点
                break;
            }
            curEmp = curEmp.next;// 后移遍历
        }
        System.out.println();
    }

    // 根据id查找雇员
    // 如果查找到返回Emp，如果没有找到返回null
    public Emp findEmpById(int id) {
        // 判断链表是否为空
        if (head == null) {
            System.out.println("链表为空");
            return null;
        }
        // 辅助指针
        Emp curEmp = head;
        while (true) {
            if (curEmp.id == id) {
                break;//这时curEmp就指向要查找的雇员
            }
            // 退出条件，说明遍历完还没找到
            if (curEmp.next == null) {
                curEmp = null;
                break;
            }
            curEmp = curEmp.next;
        }
        return curEmp;
    }
}
