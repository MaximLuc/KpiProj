package interfacesDemo.lib;

public class MyMath implements MathInterface{

    @Override
    public long myFactorial(int n) {
        if(n==1){
            return 1;
        }else{

            return n*myFactorial(n-1); 
        }
    }

    @Override
    public double myPower(double a, int n) {
        double p =1;
        for (int i = 1; i <= n; i++) {
            p*=a;
        }
        return p;
    }
    

    
}
