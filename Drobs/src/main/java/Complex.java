import static java.lang.Math.*;


public class Complex implements Operations<Complex> {
    private double real;
    private double imaginary;

    public Complex(double a, double b) {
        real = a;
        imaginary = b;
    }
//без * у i
    public Complex(String str) throws Exception {
        if(str.contains("*"))
            throw new Exception("Delete * from enter string");
        else
            checkSaveStr(str);
    }

    @Override
    public Complex clone() {
        return new Complex(real, imaginary);
    }

    @Override
    public Complex add(Complex a) {
        return new Complex(a.real + real, a.imaginary + imaginary);
    }

    @Override
    public Complex multiply(Complex a) {
        return new Complex(real * a.real - imaginary * a.imaginary, real * a.imaginary + a.real * imaginary);
    }

    @Override
    public Complex square() {
        return new Complex(real * real - imaginary * imaginary, real * imaginary + real * imaginary);
    }

    @Override
    public Complex turnOver() {
        return new Complex(real / (pow(real, 2) + pow(imaginary, 2)), (-1 * imaginary) / (pow(real, 2) + pow(imaginary, 2)));
    }

    @Override
    public Complex subtraction(Complex a) {
        return new Complex(real - a.real, imaginary - a.imaginary);
    }

    @Override
    public Complex division(Complex a) {
        return new Complex((real * a.real + imaginary * a.imaginary) / (pow(a.real, 2) + pow(a.imaginary, 2)), (a.real * imaginary - real * a.imaginary) / (pow(a.real, 2) + pow(a.imaginary, 2)));
    }

    public Complex minus() {
        Complex z = new Complex(0, 0);
        return z.subtraction(new Complex(real, imaginary));
    }

    public double module() {
        return sqrt(pow(real, 2) + pow(imaginary, 2));
    }

    public double angleRad() {
        if (real > 0) return atan(imaginary / real);
        else if (real < 0) return atan(imaginary / real) + PI;
        else if (imaginary > 0) return PI / 2;
        else if (imaginary < 0) return -PI / 2;
        else return 0;
    }

    public double angleDeg() {
        return angleRad() * 180 / PI;
    }

    public Complex complexPow(int n) {
        return new Complex(pow(module(), n) * cos(n * angleRad()), pow(module(), n) * sin(n * angleRad()));
    }

    public Complex complexRoot(int n, int i) {
        return new Complex(pow(module(), 1.0 / n) * cos((angleRad() + 2 * i * PI) / n), pow(module(), 1.0 / n) * sin((angleRad() + 2 * i * PI) / n));
    }

    public boolean equally(Complex a) {
        return (a.real == real && a.imaginary == imaginary);
    }

    public boolean notEqually(Complex a) {
        return (!equally(a));
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public String getRealSting() {
        return Double.toString(real);
    }

    public String getImaginaryString() {
        return Double.toString(imaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0)
            return getRealSting()  + getImaginaryString() +"i";
        else return getRealSting()  + imaginary +"i";
    }
    private void checkSaveStr(String in) {
        String[] parts = in.split("[+-]");
        Double re = 0.0, im = 0.0;
        int pos = -1;
        for (String s : parts) {
            if (pos != -1) {
                s = in.charAt(pos) + s;
            } else {
                pos = 0;
                if ("".equals(s)) {
                    continue;
                }
            }
            pos += s.length();
            if (s.lastIndexOf('i') == -1) {
                if (!"+".equals(s) && !"-".equals(s)) {
                    re += Double.parseDouble(s);
                }
            } else {
                s = s.replace("i", "");
                if ("+".equals(s)) {
                    im++;
                } else if ("-".equals(s)) {
                    im--;
                } else {
                    im += Double.parseDouble(s);
                }
            }
        }
        real = re;
        imaginary =im;
    }
}
