package 跳转控制语句;
//continue  跳过某次循环内容的执行，继续下一次的执行
public class continue语句 {
    public static void main(String args[]){
        for(int i = 0;i<=9;i++){
            if(i==5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
