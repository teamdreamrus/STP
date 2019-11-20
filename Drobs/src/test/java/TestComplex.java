import org.junit.Assert;
import org.junit.Test;

public class TestComplex {
    @Test
    public void testComplex() throws Exception {
        Complex actual = new Complex(1,-5);
        Complex expected = new Complex("1-i*5");
        Assert.assertEquals(expected.getReal(), actual.getReal(),0.1);
        Assert.assertEquals(expected.getImaginary(), actual.getImaginary(),0.1);
    }

    @Test
    public void testCopy(){
        Complex actual = new Complex(5,6);
        actual.clone();
        Complex expected = new Complex(5,6);
        Assert.assertEquals(expected.getReal(), actual.getReal(),0.1);
        Assert.assertEquals(expected.getImaginary(), actual.getImaginary(),0.1);
    }

    @Test
    public void testAdd(){
        Complex cn1 = new Complex(7,9);
        Complex cn2 = new Complex(9,4);
        Complex actual = cn1.add(cn2);
        Complex expected = new Complex(16,13);
        Assert.assertEquals(expected.getReal(), actual.getReal(), 0.1);
        Assert.assertEquals(expected.getImaginary(), actual.getImaginary(), 0.1);
    }

    @Test
    public void testMultiply(){
        Complex cn1 = new Complex(7, 9);
        Complex cn2 = new Complex(9,4);
        Complex actual = cn1.multiply(cn2);
        Complex expected = new Complex(27,109);
        Assert.assertEquals(expected.getReal(), actual.getReal(), 0.1);
        Assert.assertEquals(expected.getImaginary(), actual.getImaginary(), 0.1);
    }

    @Test
    public void testSquare(){
        Complex cn = new Complex(7,9);
        Complex actual = cn.square();
        Complex expected = new Complex(-32,126);
        Assert.assertEquals(expected.getReal(), actual.getReal(), 0.1);
        Assert.assertEquals(expected.getImaginary(), actual.getImaginary(), 0.1);
    }

    @Test
    public void testTurnOver(){
        Complex cn = new Complex(7,9);
        Complex actual = cn.turnOver();
        Complex expected = new Complex(0.05,-0.07);
        Assert.assertEquals(expected.getReal(), actual.getReal(), 0.1);
        Assert.assertEquals(expected.getImaginary(), actual.getImaginary(), 0.1);
    }

    @Test
    public void testSubtraction(){
        Complex cn1 = new Complex(7,9);
        Complex cn2 = new Complex(9,4);
        Complex actual = cn1.subtraction(cn2);
        Complex expected = new Complex(-2,5);
        Assert.assertEquals(expected.getReal(), actual.getReal(), 0.1);
        Assert.assertEquals(expected.getImaginary(), actual.getImaginary(), 0.1);
    }

    @Test
    public void testDivision(){
        Complex cn1 = new Complex(7,9);
        Complex cn2 = new Complex(9,4);
        Complex actual = cn1.division(cn2);
        Complex expected = new Complex(1.02,0.55);
        Assert.assertEquals(expected.getReal(), actual.getReal(), 0.1);
        Assert.assertEquals(expected.getImaginary(), actual.getImaginary(), 0.1);
    }

    @Test
    public void testMinus(){
        Complex cn = new Complex(7,9);
        Complex actual = cn.minus();
        Complex expected = new Complex(-7,-9);
        Assert.assertEquals(expected.getReal(), actual.getReal(), 0.1);
        Assert.assertEquals(expected.getImaginary(), actual.getImaginary(), 0.1);
    }

    @Test
    public void testModule(){
        Complex cn = new Complex(7,9);
        double actual = cn.module();
        double expected = 11.4;
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testAngleRad(){
        Complex cn = new Complex(1,1);
        double actual = cn.angleRad();
        double expected = 0.79;
        Assert.assertEquals(expected,actual,0.1);
    }

    @Test
    public void testAngleDeg(){
        Complex cn = new Complex(1,1);
        double actual = cn.angleDeg();
        double expected = 45;
        Assert.assertEquals(expected,actual,0.1);
    }

    @Test
    public void testComplexPow(){
        Complex cn = new Complex(7,9);
        Complex actual = cn.complexPow(3);
        Complex expected = new Complex(-1358,594);
        Assert.assertEquals(expected.getReal(), actual.getReal(), 0.1);
        Assert.assertEquals(expected.getImaginary(), actual.getImaginary(), 0.1);
    }

    @Test
    public void testComplexRoot(){
        Complex cn = new Complex(7,9);
        Complex actual = cn.complexRoot(3,2);
        Complex expected = new Complex(-0.49,-2.19);
        Assert.assertEquals(expected.getReal(), actual.getReal(), 0.1);
        Assert.assertEquals(expected.getImaginary(), actual.getImaginary(), 0.1);
    }

    @Test
    public void testEqually(){
        Complex cn = new Complex(7,9);
        boolean actual = cn.equally(cn);
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNotEqually(){
        Complex cn = new Complex(7,9);
        boolean actual = cn.notEqually(cn);
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetReal(){
        Complex cn = new Complex(7,9);
        double actual = cn.getReal();
        double expected = 7;
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testGetImaginary(){
        Complex cn = new Complex(7,9);
        double actual = cn.getImaginary();
        double expected = 9;
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testGetRealString(){
        Complex cn = new Complex(7,9);
        String actual = cn.getRealSting();
        String expected = "7.0";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetImaginaryString(){
        Complex cn = new Complex(7,9);
        String actual = cn.getImaginaryString();
        String expected = "9.0";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetComplex(){
        Complex cn = new Complex(7,9);
        String actual = cn.toString();
        String expected = "7.0+i*9.0";
        Assert.assertEquals(expected, actual);
    }
}
