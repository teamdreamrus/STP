import static java.lang.Math.*;

public class Complex {
    public double real;
    public double imaginary;
    public Complex(double a,double b){
        real = a;
        imaginary = b;
    }
    public Complex(String str){

        if(str.contains("-")){
            String[]  strs= str.split("-i");
            real = Double.valueOf(strs[0]);
            String[] strI = str.split("i\\*");
            imaginary = Double.valueOf(strI[1])*(-1);
        }else{
            String[] strs = str.split("\\+");
            real = Double.valueOf(strs[0]);
            String[] strI = str.split("i\\*");
            imaginary = Double.valueOf(strI[1]);
        }

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
        if(real>0) return atan(imaginary/real);
        else if(real<0) return atan(imaginary/real)+PI;
        else if(imaginary>0) return PI/2;
        else if(imaginary<0) return -PI/2;
        else return 0;
    }
    public double angleDeg(){
        return angleRad()*180/PI;
    }
    public Complex complexPow(int n){
        return new Complex(pow(module(),n)*cos(n*angleRad()),pow(module(),n)*sin(n*angleRad()));
    }
    public Complex complexRoot(int n, int i){
            return new Complex(pow(module(),1.0/i)*cos((angleRad()+2*i*PI)/i),pow(module(),1.0/i)*sin((angleRad()+2*i*PI)/i));
    }
    public boolean equally(Complex a){
        return(a.real==real && a.imaginary==imaginary);
    }
    public boolean notEqually(Complex a){
        return(!equally(a));
    }
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public String getRealSting(){
        return Double.toString(real);
    }
    public String getImaginaryString(){
        return Double.toString(imaginary);
    }
    public String getComplex(){
        if(imaginary>=0)
            return getRealSting()+"+i*"+getImaginaryString();
        else return getRealSting()+"-i*"+imaginary*(-1);
    }

}
