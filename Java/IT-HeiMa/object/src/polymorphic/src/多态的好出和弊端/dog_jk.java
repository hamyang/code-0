package 多态的好出和弊端;

public interface dog_jk {
    default void lookDoor(){
        System.out.println("狗看门");
    }
}
