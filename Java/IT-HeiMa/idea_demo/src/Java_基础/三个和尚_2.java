package Java_基础;

public class 三个和尚_2 {
    public static void main(String args[]){
            int height1 = 150;
            int height2 = 210;
            int height3 = 165;
          int tempHeight =  height1 > height2 ? height1 : height2;
          int tempHeight1 = tempHeight > height3 ? tempHeight : height3;

        System.out.println("tempHeight:" +tempHeight1);
    }

}
