public abstract class graph {
    //抽象方法
    public abstract void figure();

    //非抽象方法1
    public void difference1() {
        System.out.println("是曲线图形");
    }

    //非抽象方法2
    public void difference2() {
        System.out.println("是直线型图形");
    }
}

class rectangle extends graph {
    @Override
    public void figure() {
        System.out.println("矩形");
    }

    @Override
    public void difference2() {
        super.difference2();
    }
}

class triangle extends graph {
    @Override
    public void figure() {
        System.out.println("三角形");
    }

    @Override
    public void difference2() {
        super.difference2();
    }
}

class circular extends graph {
    @Override
    public void figure() {
        System.out.println("圆形");
    }

    @Override
    public void difference1() {
        super.difference1();
    }
}

class oval extends graph {
    @Override
    public void figure() {
        System.out.println("椭圆形");
    }

    @Override
    public void difference1() {
        super.difference1();
    }
}

class graphDemo1 extends rectangle {
    public static void main(String[] args) {
        //多态
        graph graph1 = new rectangle();
        graph1.figure();
        graph1.difference2();
        graph graph2 = new rectangle();
        graph2.figure();
        graph2.difference2();
        graph graph3 = new rectangle();
        graph3.figure();
        graph3.difference1();
        graph graph4 = new rectangle();
        graph4.figure();
        graph4.difference1();
    }
}
