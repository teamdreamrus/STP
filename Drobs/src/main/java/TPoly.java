import java.util.ArrayList;
import java.util.Collections;

public class TPoly {

    private int c, n;
    private ArrayList<TMember> vec = new ArrayList<>();

    public TPoly(int coeff, int n) {
        vec.add(new TMember(coeff, n));
    }

    public TPoly(ArrayList<TMember> list) {
        vec = list;
    }

    public TPoly() {
        c = 0;
        n = 0;
    }

    public int power() {
        int max_pow = 0;
        for (TMember i : vec) {
            max_pow = Math.max(max_pow, i.getDegree());
        }
        return max_pow;
    }

    public int coefficient(int deg) {
        int degree = 0;
        for (TMember i : vec) {
            if (i.getDegree() == deg) {
                degree = i.getCoeff();
            }
        }
        return degree;
    }

    public void clear() {
        vec.clear();
    }


    public TPoly add(TPoly secNum) {
        this.sortByDegree();
        secNum.sortByDegree();

        int count = this.vec.size();

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < secNum.vec.size(); j++) {
                if (this.vec.get(i).getDegree() == secNum.vec.get(j).getDegree()){
                    this.vec.get(i).setCoeff(this.vec.get(i).getCoeff()
                            + secNum.vec.get(i).getCoeff());
                } else {
                    if (i == j) {
                        this.vec.add(secNum.vec.get(j));
                    }
                }
            }
        }
        return this;
    }

    public TPoly subtract(TPoly secNum) {
        this.sortByDegree();
        secNum.sortByDegree();

        for (int i = 0; i < this.vec.size(); i++) {
            for (int j = 0; j < secNum.vec.size(); j++){
                if (this.vec.get(i).getDegree() == secNum.vec.get(j).getDegree()) {
                    this.vec.get(i).setCoeff(this.vec.get(i).getCoeff()
                            - secNum.vec.get(i).getCoeff());
                } else {
                    if (i == j) {
                        this.vec.add(secNum.vec.get(j));
                    }
                }
            }
        }
        return this;
    }

    public TPoly multiply(TPoly secNum) {
        this.sortByDegree();
        secNum.sortByDegree();

        for (TMember i : this.vec) {
            for (TMember j : secNum.vec) {
                i.setDegree((i.getDegree() + j.getDegree()));
                i.setCoeff(i.getCoeff() + j.getCoeff());
            }
        }
        return this;
    }
    public TPoly minus() {
        for (TMember i : this.vec) {
            i.setCoeff(-1 * i.getCoeff());
        }
        return this;
    }

    public boolean equal(TPoly secNum) {
        this.sortByDegree();
        secNum.sortByDegree();

        if (this.vec.size() != secNum.vec.size()) {
            return false;
        } else {
            for (int i = 0; i < this.vec.size(); i++) {
                if (this.vec.get(i) != secNum.vec.get(i)){
                    return false;
                }
            }
            return true;
        }
    }

    public void sortByDegree() {
        Collections.sort(vec, new SortByDegree());
    }

    public  double evaluate(double x) {
        double result = 0;
        for (TMember i : vec) {
            result += i.getCoeff() * Math.pow(x, i.getDegree());
        }
        return result;
    }

    public String elementAt(int index) {
        return  (vec.get(index).getCoeff() + "x^"
                + vec.get(index).getDegree());
    }

    public String getPolinom() {
        String temp = "";
        for (int i = 0; i < this.vec.size(); i++) {
            temp += ((i>0 && vec.get(i).getCoeff() > 0) ? "+" : "") + vec.get(i).getCoeff()  + "x^" + vec.get(i).getDegree();
        }
        return temp;
    }

}
