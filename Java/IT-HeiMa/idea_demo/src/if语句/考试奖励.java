package if语句;
import java.util.Scanner;
public class 考试奖励 {
        public static void main (String[] args) {
            Scanner sc = new Scanner (System.in);
            int x = sc.nextInt();
            if(x>=95&x<=100){ System.out.println("获得山地自行车一辆");
            }else if (x>=90&x<94){ System.out.println("去游乐场");
            }else if (x>=80&x<=89){ System.out.println("获得变形金刚");
            }else if (x<80&x>=0){ System.out.println("你将被打");
            }else { System.out.println("输入错误");
            }

        }
    }



