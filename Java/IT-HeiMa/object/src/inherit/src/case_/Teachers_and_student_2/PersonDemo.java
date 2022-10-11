package case_.Teachers_and_student_2;
//import case_.Cats_and_dogs.Dog;导包
public class PersonDemo {
    public static void main(String[] args) {
//        无参构造
        Teacher t1 = new Teacher();
        t1.setName("黄洋");
        t1.setAge(19);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();
//        带参构造
        Teacher t2 = new Teacher("风清扬", 22);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();
//        package  导包
//        case_.Cats_and_dogs.Dog d = new case_.Cats_and_dogs.Dog();
//        d.lookDoor();
    }
}
