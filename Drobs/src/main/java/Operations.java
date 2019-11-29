public interface Operations<T> {
 //    Fraction defFract = new Fraction(0,1);
     T subtraction(T number) throws Exception;
     T add(T number) throws Exception;
     T multiply(T number) throws Exception;
     T division(T number) throws Exception;
     T square() throws Exception;
     T turnOver() throws Exception;
}
