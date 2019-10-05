public class Fraction {
    public long numerator;
    public long denominator;

    public Fraction(){
    }

    public Fraction(long num, long den){
       if(checkFraction(num, den)){
            numerator = num;
            denominator = den;
            reduction();
        }
    }
    public Fraction(String str){

        String[] arr = str.split("/");
        if (checkFraction(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]))){
            numerator = Integer.parseInt(arr[0]);
            denominator = Integer.parseInt(arr[1]);
           reduction();
        }
    }
    public boolean checkFraction(long num, long den){
             if(den != 0) return true;
        else {
            System.out.println("Division by zero");
            return false;
        }
    }


    public void reduction(){
        if(numerator == 0){
            denominator = 1;
        }
        if(denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        long mn = factor(Math.abs(numerator),  Math.abs(denominator));

        if(mn != 0) {
            numerator = numerator / mn;
            denominator = denominator / mn;
        }
    }

    public Fraction copyFraction(){
        return  new Fraction(numerator, denominator);
    }

    public String toString(){
        return numerator + "/" + denominator;
    }

    public  void output(){
        System.out.println(toString());
    }


    private static long factor(long a, long b){
        if(b==0) return a;
        return factor(b,a%b);
    }


    double getNumD(){
        return numerator /1.0;
    }
    double getDemD(){
        return denominator /1.0;
    }
    String getNumS(){
        return Long.toString(numerator);
    }
    String getDemS(){
        return Long.toString(denominator);
    }

    public Fraction add(Fraction d1){
        return new Fraction(numerator *d1.denominator+ d1.numerator* denominator, denominator *d1.denominator);
    }

    public Fraction square(){
        return new Fraction(numerator * numerator, denominator * denominator);
    }

    public Fraction minus(){
       // Fraction a = new Fraction(numerator,denominator);
       // a.numerator *=-1;
        return  (new Fraction(numerator*(-1),denominator));
    }

    public Boolean equally(Fraction d){
        return  (numerator == d.numerator && denominator ==d.denominator );
    }
    public Boolean isMoreThen(Fraction d1){
        return  (numerator / denominator > d1.numerator / d1.denominator );
    }

    public Fraction turnOver(){
        return new Fraction(denominator, numerator);
    }

    public Fraction multiply(Fraction d1){
        return new Fraction(d1.numerator* numerator,d1.denominator* denominator);
    }

    public Fraction division(Fraction d1){
        return new Fraction(d1.denominator* numerator,d1.numerator* denominator);
    }

    public Fraction subtraction(Fraction d1){
        return new Fraction(numerator *d1.denominator - d1.numerator* denominator,d1.denominator* denominator);
    }

}