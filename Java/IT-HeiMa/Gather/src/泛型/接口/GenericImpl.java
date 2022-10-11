package 泛型.接口;

public class GenericImpl<T> implements Generic<T> {

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
