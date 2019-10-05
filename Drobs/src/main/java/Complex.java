import static java.lang.Math.*;

public class Complex {
    private double real;
    private double imaginary;
    public Complex(double a,double b){
        real = a;
        imaginary = b;
    }
    public Complex(String str){
        String[] strs = str.split("\\+");
        real = Double.valueOf(strs[0]);
        String[] strs2 = strs[1].split("i\\*");
        imaginary = Double.valueOf(strs2[1]);
    }
    public Complex copyComplex(){
        return new Complex(real,imaginary);
    }
    public Complex add(Complex a){
        return new Complex(a.real+ real,a.imaginary+imaginary);
    }
    public Complex multiply(Complex a){
        return new Complex(real*a.real - imaginary*a.imaginary,real*a.imaginary+ a.real*imaginary);
    }
    public Complex square(){
        return new Complex(real*real - imaginary*imaginary,real*imaginary+ real*imaginary);
    }
    public Complex turnOver(){
        return new Complex(real/(pow(real,2) + pow(imaginary,2)), (-1 *imaginary) /( pow(real,2) + pow(imaginary,2) ));
    }
    public Complex subtraction(Complex a){
        return new Complex(real -  a.real,imaginary-a.imaginary);
    }
    public Complex division(Complex a){
        return new Complex((real*a.real + imaginary*a.imaginary)/(pow(a.real,2) + pow(a.imaginary,2)),(a.real*imaginary - real*a.imaginary)/(pow(a.real,2) + pow(a.imaginary,2)));
    }
    public Complex minus(){
        Complex z = new Complex(0,0);
        return z.subtraction(new Complex(real,imaginary));
    }
    public double module(){
        return sqrt(pow(real,2)+pow(imaginary,2));
    }
    public double angleRad(){
//        arcTg(b/a), a>0;
//        pi/2, a = 0, b > 0;
//        arcTg(b/a) + pi, a < 0;
//        -pi/2, a = 0, b < 0;
        if(real>0) return atan(imaginary/real);
        else if(real<0) return atan(imaginary/real)+PI;
        else if(imaginary>0) return PI/2;
        else if(imaginary<0) return -PI/2;
        else return 0;
    }

}
