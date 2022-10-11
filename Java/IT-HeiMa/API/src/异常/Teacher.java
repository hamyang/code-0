package 异常;

public class Teacher {
    public void checkScore(int score)throws 自定义异常{
        if (score<0||score>100){
//            throw new 自定义异常();
            throw new 自定义异常("你给的分数有误，分数应该在0~100之间");//抛出异常对象

        }else{
            System.out.println("分数正常");
        }
    }
}
//总结
//throws 用在方法声明后面，跟的时异常类名
//       表示抛出异常，由该方法的调用者来处理
//       表示出现异常的一种可能性，并不一定会发生这些异常
//throw  用在方法体内，跟的是异常对象名
//       表示抛出异常，由方法体内的语句处理、
//       执行throw一定抛出了某种异常