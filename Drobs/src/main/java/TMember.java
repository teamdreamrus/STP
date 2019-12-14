public class TMember {

    private int FCoeff, FDegree;

    public TMember(int coeff, int power) {
        FCoeff = coeff;
        FDegree = power;
    }

    public int getDegree() {
        return  FDegree;
    }

    public void setDegree(int n) {
        FDegree = n;
    }

    public int getCoeff() {
        return  FCoeff;
    }

    public  void setCoeff(int n) {
        FCoeff = n;
    }

    public boolean equal(TMember secNum) {
        return (FCoeff == secNum.FCoeff) && (FDegree == secNum.FDegree);
    }

    public TMember derivate() {
        return new TMember(this.FDegree * this.FCoeff, this.FDegree - 1);
    }

    public double evaluate(double x) {
        return  Math.pow(x, FDegree) * FCoeff;
    }

    public String getStringRepr() {
        return this.FCoeff + "x^" + this.FDegree;
    }

}
