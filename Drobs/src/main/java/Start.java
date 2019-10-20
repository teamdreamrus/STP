public class Start {


    public static void main(String[] args) {

//
//        Fraction a = new Fraction("1/2");
//
//        System.out.println(a.toString());
//        System.out.println(a.minus().toString());

//    Complex c = new Complex("1+i*1");
//        System.out.println(c.toString());


        PNumber n = new PNumber("A.A","16","2");
        PNumber pn1 = new PNumber(15, 10, 1);
        PNumber pn2 = new PNumber("A","16","1");
        PNumber actual = pn1.add(pn2);
        System.out.println(actual.toString());
       // System.out.println(n.convertFromDecimal(58.625,16,2));
    }

}