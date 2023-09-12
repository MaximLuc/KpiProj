package interfacesDemo.App;
import interfacesDemo.lib.*;
public class App {
    public static void main(String[] args) {
        
        final double base = 3.14;
        final int level = 7;

        MathInterface mm = new MyMath();

        double f = mm.myFactorial(level);
        double m=mm.myPower(base, level);

        System.out.println(f+ "   "+m);
        
    }
}
