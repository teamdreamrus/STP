import java.math.BigDecimal;
import java.util.Arrays;

import static java.lang.Math.pow;

public class PNumber implements Operations<PNumber> {
    private Double number;
    private int base;
    private int accuracy;

    public PNumber(double number, int base, int accuracy) {

        if (CheckB(base) & CheckC(accuracy)) {
            this.number = number;
            this.base = base;
            this.accuracy = accuracy;
        } else throw new ArithmeticException("error enter data");
    }

    public PNumber(String number, String base, String accuracy) {

        if (!(CheckB(Integer.parseInt(base)) & CheckC(Integer.parseInt(accuracy)))) {
            throw new ArithmeticException("error enter data");
        }
        this.base = Integer.parseInt(base);
        this.accuracy = Integer.parseInt(accuracy);
        if (this.base != 10) {
            this.number = convertToDecimal(number, Integer.parseInt(base));
        } else {
            this.number = Double.parseDouble(number);
        }
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

    public int getBase() {
        return base;
    }

    public String getBaseString() {
        return String.valueOf(base);
    }

    public int getAccuracy() {
        return accuracy;
    }

    public String getAccuracyString() {
        return String.valueOf(accuracy);
    }

    public void setBase(int base) {
        if (CheckB(base))
            this.base = base;
        else throw new ArithmeticException("error enter data(base)");
    }

    public void setAccuracy(int accuracy) {
        if (CheckC(accuracy))
            this.accuracy = accuracy;
        else throw new ArithmeticException("error enter data(accuracy)");
    }

    public void setBaseString(String base) {
        if (CheckB(Integer.parseInt(base)))
            this.base = Integer.parseInt(base);
        else throw new ArithmeticException("error enter data(base)");
    }

    public void setAccuracyString(String accuracy) {
        if (CheckC(Integer.parseInt(accuracy)))
            this.accuracy = Integer.parseInt(accuracy);
        else throw new ArithmeticException("error enter data(accuracy)");

    }

    @Override
    public PNumber add(PNumber d) {
        return new PNumber(number + d.getNumber(), base, accuracy);
    }

    @Override
    public PNumber multiply(PNumber d) {
        return new PNumber(number * d.getNumber(), base, accuracy);
    }

    @Override
    public PNumber subtraction(PNumber d) {
        return new PNumber(number - d.getNumber(), base, accuracy);
    }

    @Override
    public PNumber division(PNumber d) {
        if (d.getNumber() != 0)
            return new PNumber(number / d.getNumber(), base, accuracy);
        else throw new ArithmeticException("division by zero, operation is cancel");
    }

    @Override
    public PNumber turnOver() {
        if (number != 0)
            return new PNumber(1 / number, base, accuracy);
        else throw new ArithmeticException("division by zero, operation is cancel");
    }

    @Override
    public PNumber square() {
        return new PNumber(number * number, base, accuracy);
    }

    @Override
    public String toString() {
        return convertFromDecimal(number, base, accuracy);
    }

    private String convertFromDecimal(Double number, int base, int accuracy) {
        String[] massNumber = number.toString().split("\\.");
        StringBuilder result = new StringBuilder();
        Integer wholePart = Integer.parseInt(massNumber[0]);
        Double fractionalPart = Double.parseDouble("0." + massNumber[1]);
        if (wholePart >= base) {
            while (wholePart >= base) {
                result.append(changeToChar(wholePart % base));
                wholePart /= base;

            }
            result.append(wholePart);
            result = result.reverse();
        } else {
            result.append(changeToChar(wholePart));
        }


        result.append(".");

        for (int i = 0; i < accuracy; i++) {
            fractionalPart *= base;
            result.append(changeToChar(fractionalPart.intValue()));
            fractionalPart %= 1;
        }
        return result.toString();
    }

    private double convertToDecimal(String number, int base) {
        String[] massNumber = number.split("\\.");
        double result = 0d;

        for (int i = 0; i < massNumber[0].length(); i++) {
            char num = massNumber[0].charAt(i);
            int position = massNumber[0].length() - i - 1;
            result += changeToNumber(num) * Math.pow(base, position);
        }

        if(massNumber.length==2){
            for (int i = -1; Math.abs(i) <= massNumber[1].length(); i--) {
                char num = massNumber[1].charAt(Math.abs(i) - 1);
                result += changeToNumber(num) * Math.pow(base, i);

            }
        }
        return result;
    }

    private char changeToChar(int number) {
        return number < 10 ? (char) ('0' + number) : (char) ('A' + number - 10);
    }

    private Double changeToNumber(char number) {
        return number > '9' ? (double) number - 'A' + 10 : number - '0';
    }
}
