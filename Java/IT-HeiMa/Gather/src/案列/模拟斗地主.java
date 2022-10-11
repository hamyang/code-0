package 案列;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class 模拟斗地主 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        String[] colors = {"♣", "♥", "♦", "♠"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("小王");
        array.add("大王");
//        洗牌
        Collections.shuffle(array);
        System.out.println(array);
//        发牌
        ArrayList<String> 林青霞Array = new ArrayList<>();
        ArrayList<String> 黄洋Array = new ArrayList<>();
        ArrayList<String> 风清扬Array = new ArrayList<>();
        ArrayList<String> dpArray = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i >= array.size() - 3) {
                dpArray.add(poker);
            } else if (i % 3 == 0) {
                林青霞Array.add(poker);
            } else if (i % 3 == 1) {
                黄洋Array.add(poker);
            } else if (i % 3 == 2) {
                风清扬Array.add(poker);
            }
        }
//        看牌
        lookpoker("林青霞",林青霞Array);
        lookpoker("黄洋",黄洋Array);
        lookpoker("风清扬",风清扬Array);
        System.out.println("底牌是"+dpArray);

    }
    public static void lookpoker(String name,ArrayList<String> array){
        System.out.print(name+"的牌是");
        for (String poker:array){
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
