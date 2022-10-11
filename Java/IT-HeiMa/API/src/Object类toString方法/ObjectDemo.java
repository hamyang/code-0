package Object类toString方法;

//看方法源码，选中方法ctrl+B
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(30);
        System.out.println(s);//API练习.ObjectDemo.Student@1b6d3586
        System.out.println(s.toString());
        /*   public void println(Object x) {//x=s
                String s = String.valueOf(x);
                synchronized (this) {
                    print(s);
                    newLine();
        }*/
        /*    public static String valueOf(Object obj) {//obj=x
                return (obj == null) ? "null" : obj.toString();
    }*/
        /*public String toString() {
             return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }*/
    }
}
