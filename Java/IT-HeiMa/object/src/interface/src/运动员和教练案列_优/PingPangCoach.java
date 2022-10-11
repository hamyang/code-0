package 运动员和教练案列_优;
//乒乓球教练
public class PingPangCoach extends Coach implements SpeakEnglish {
    public PingPangCoach() {
    }
    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教如何发球");
    }
    @Override
    public void eat() {
        System.out.println("乒乓球教练吃饭");
    }
    @Override
    public void speak() {

    }
}
