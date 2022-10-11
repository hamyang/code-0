import org.testng.annotations.Test;

public class hello {
    public static void main(String[] args) {
        Dom dom = new Dom(2, 3);
        Dom dom1 = new Dom(3, 4);
        double distance = Dom.getDistance(dom,dom1);
        System.out.println(distance);
    }
}

class Dom {
    double x;
    double y;

    public Dom(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Test
    public static double getDistance(Dom dom1, Dom dom2) {
        return Math.sqrt((dom1.x - dom2.x) * (dom1.x - dom2.x) + (dom1.y - dom2.y) * (dom1.y - dom2.y));
    }
}


