public class 二叉树 {
    public static void main(String[] args) {
        // 创建一颗二叉树
        BinaryTree binaryTree = new BinaryTree();
        // 创建需要的节点
        HeroNode3 root = new HeroNode3(1, "宋江");
        HeroNode3 node2 = new HeroNode3(2, "吴用");
        HeroNode3 node3 = new HeroNode3(3, "卢俊义");
        HeroNode3 node4 = new HeroNode3(4, "林冲");
        HeroNode3 node5 = new HeroNode3(5, "小明");
        // 手动创建
        binaryTree.setRoot(root);
        root.setLeft(node2);
        root.setRight(node3);
        node3.setRight(node4);
        node4.setRight(node5);
        // 测试
        System.out.println("前序遍历");
        binaryTree.preOrder();
        System.out.println("中序遍历");
        binaryTree.infixOrder();
        System.out.println("后序遍历");
        binaryTree.postOrder();
        // 查找测试
        System.out.println("前序遍历方式~~~次数4次");
        HeroNode3 resNode = binaryTree.preOrdersearch(5);
        if (resNode != null) {
            System.out.printf("找到了编号为no=%d name=%s", resNode.getNo(), resNode.getName());
        } else {
            System.out.printf("没找到no=%d的英雄", 5);
        }
        System.out.println();
        System.out.println("中序遍历方式~~~次数3次");
        HeroNode3 resNode2 = binaryTree.infixOrderSearch(5);
        if (resNode2 != null) {
            System.out.printf("找到了编号为no=%d name=%s", resNode2.getNo(), resNode2.getName());
        } else {
            System.out.printf("没找到no=%d的英雄", 5);
        }
        System.out.println();
        System.out.println("后序遍历方式~~~次数2次");
        HeroNode3 resNode3 = binaryTree.postOrderSearch(5);
        if (resNode3 != null) {
            System.out.printf("找到了编号为no=%d name=%s", resNode3.getNo(), resNode3.getName());
        } else {
            System.out.printf("没找到no=%d的英雄", 5);
        }
        System.out.println();
        // 删除节点_前序遍历
        binaryTree.preOrder();
        binaryTree.delNode(5);
        System.out.println();

        System.out.println("前序遍历");
        binaryTree.preOrder();
    }
}

// 定义一个二叉树
class BinaryTree {
    private HeroNode3 root;

    public void setRoot(HeroNode3 root) {
        this.root = root;
    }

    // 删除节点
    public void delNode(int no) {
        if (root!=null){
            if (root.getNo()==no){
                this.root = null;
            }else {
                root.delNode(no);
            }
        }else {
            System.out.println("这是空数无法删除");
        }
    }

    // 前序遍历
    public void preOrder() {
        if (this.root != null) {
            this.root.preOrder();
        } else {
            System.out.println("二叉树为空，无法遍历");
        }
    }

    // 中序遍历
    public void infixOrder() {
        if (this.root != null) {
            this.root.infixOrder();
        } else {
            System.out.println("二叉树为空，无法遍历");
        }
    }

    // 后续遍历
    public void postOrder() {
        if (this.root != null) {
            this.root.preOrder();
        } else {
            System.out.println("二叉树为空，无法遍历");
        }
    }

    // 前序遍历
    public HeroNode3 preOrdersearch(int no) {
        if (root != null) {
            return root.postOrderSearch(no);
        } else {
            return null;
        }
    }

    // 中序遍历
    public HeroNode3 infixOrderSearch(int no) {
        if (root != null) {
            return root.infixOrderSearch(no);
        } else {
            return null;
        }
    }

    // 中序遍历
    public HeroNode3 postOrderSearch(int no) {
        if (root != null) {
            return root.postOrderSearch(no);
        } else {
            return null;
        }
    }

}

class HeroNode3 {
    private int no;
    private String name;
    private HeroNode3 left;
    private HeroNode3 right;

    public HeroNode3(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode3 getLeft() {
        return left;
    }

    public void setLeft(HeroNode3 left) {
        this.left = left;
    }

    public HeroNode3 getRight() {
        return right;
    }

    public void setRight(HeroNode3 right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    // 递归删除节点
    public void delNode(int no) {
        // 左子节点
        if (this.left != null && this.left.no == no) {
            this.left = null;
            return;
        }
        // 右子节点
        if (this.right != null && this.right.no == no) {
            this.right = null;
            return;
        }
        // 向左子数递归
        if (this.left != null) {
            this.left.delNode(no);
        }
        // 向右子数递归
        if (this.right != null) {
            this.right.delNode(no);
        }
    }

    // 前序遍历(根左右)
    public void preOrder() {
        // 先输出父结点
        System.out.println(this);
        // 递归向左子数
        if (this.left != null) {
            this.left.preOrder();
        }
        // 递归向右子树遍历
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    // 中序遍历(左根右)
    public void infixOrder() {
        // 递归向左子数中序遍历
        if (this.right != null) {
            this.right.infixOrder();
        }
        // 输出父节点
        System.out.println(this);
        // 递归向右子数中序遍历
        if (this.left != null) {
            this.right.infixOrder();
        }
    }

    // 后续遍历(左右根)
    public void postOrder() {
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
        System.out.println(this);
    }

    // 前序遍历查找

    /**
     * @param no 查找no
     * @return 如果找到就返回Node，没有找到就返回null
     */
    public HeroNode3 preOrdersearch(int no) {
        HeroNode3 resNode = null;
        // 比较当前节点是不是
        if (this.no == no) {
            return this;
        }
        // 左递归
        if (this.left != null) {
            resNode = this.left.preOrdersearch(no);
        }
        // 说明在左子树找到
        if (resNode != null) {
            return resNode;
        }
        // 右递归
        if (this.right != null) {
            resNode = this.right.preOrdersearch(no);
        }
        return resNode;
    }

    // 中序遍历
    public HeroNode3 infixOrderSearch(int no) {
        HeroNode3 resNode = null;
        // 左递归
        if (this.left != null) {
            resNode = this.left.infixOrderSearch(no);
        }
        // 说明在左子树找到
        if (resNode != null) {
            return resNode;
        }
        // 比较当前节点是不是
        if (this.no == no) {
            return this;
        }
        // 右递归
        if (this.right != null) {
            resNode = this.right.infixOrderSearch(no);
        }
        return resNode;
    }

    // 后序遍历
    public HeroNode3 postOrderSearch(int no) {
        HeroNode3 resNode = null;
        // 左递归
        if (this.left != null) {
            resNode = this.left.postOrderSearch(no);
        }
        // 说明在左子树找到
        if (resNode != null) {
            return resNode;
        }
        // 右递归
        if (this.right != null) {
            resNode = this.right.postOrderSearch(no);
        }
        // 说明在右子树找到
        if (resNode != null) {
            return resNode;
        }
        // 比较当前节点是不是
        if (this.no == no) {
            return this;
        }
        return resNode;
    }

}

