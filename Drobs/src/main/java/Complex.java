import static java.lang.Math.*;

// исправить конструктор строки
public class Complex implements Operations<Complex> {
    private double real;
    private double imaginary;

    public Complex(double a, double b) {
        real = a;
        imaginary = b;
    }

    public Complex(String str) {

        if (str.contains("-")) {//Может быть отрицательм А тогда не сработает (юз реглярные выражения)
            String[] strs = str.split("-i");
            real = Double.parseDouble(strs[0]);
            String[] strI = str.split("i\\*");
            imaginary = Double.parseDouble(strI[1]) * (-1);
        } else {
            String[] strs = str.split("\\+");
            real = Double.parseDouble(strs[0]);
            String[] strI = str.split("i\\*");
            imaginary = Double.parseDouble(strI[1]);
        }

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
            return getRealSting() + "+i*" + getImaginaryString();
        else return getRealSting() + "-i*" + imaginary * (-1);
    }

}
