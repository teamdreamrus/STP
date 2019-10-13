import java.util.Arrays;

import static java.lang.Math.pow;

public class PNumber {
    private double number;
    private int base;
    private int accuracy;

    public PNumber(String number, int base, int accuracy) {

        if (CheckB(base) & CheckC(accuracy)) {
            this.number = fractToDecimal(number,base);
            this.base = base;
            this.accuracy = accuracy;
        } else throw new ArithmeticException("error enter data");
    }

    private boolean CheckB(int b) {
        return (b >= 2 & b <= 16);
    }

    private boolean CheckC(int c) {
        return (c >= 0);
    }

    public double getNumber() {
        return number;
    }

    private double fractToDecimal(String number, int base) {
        int whole=0;
        double fractional=0;
        String[] num= number.split("\\.");
        if(num.length>2) throw new ArithmeticException("error enter data");
        else{
            whole=Integer.parseInt(num[0],base);
            String[] fract = num[1].split("");
            for(int i=0;i<num[1].length();i++){
                fractional += Integer.parseInt(fract[i])*pow(base,(i+1)*(-1));
            }
            System.out.println(whole);
            System.out.println(fractional);
            return (whole+fractional);
        }
    }

}
