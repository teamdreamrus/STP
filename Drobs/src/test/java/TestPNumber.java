import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPNumber {

    @Test
    public void PNumber() {
        PNumber actual = new PNumber(15, 10, 1);
        PNumber expected = new PNumber("15", "10", "1");
        Assert.assertEquals(expected.getNumber(), actual.getNumber(), 0.1);
        Assert.assertEquals(expected.getBase(), actual.getBase());
        Assert.assertEquals(expected.getAccuracy(), actual.getAccuracy());
    }

    @Test
    public void getNumber() {
        PNumber actual = new PNumber(15, 10, 1);
        double expected = 15;
        Assert.assertEquals(expected, actual.getNumber(), 0.1);
    }

    @Test
    public void getBase() {
        PNumber actual = new PNumber(15, 10, 1);
        int expected = 10;
        Assert.assertEquals(expected, actual.getBase());
    }

    @Test
    public void getBaseString() {
        PNumber actual = new PNumber(15, 10, 1);
        String expected = "10";
        Assert.assertEquals(expected, actual.getBaseString());
    }

    @Test
    public void getAccuracy() {
        PNumber actual = new PNumber(15, 10, 1);
        int expected = 1;
        Assert.assertEquals(expected, actual.getAccuracy());
    }

    @Test
    public void getAccuracyString() {
        PNumber actual = new PNumber(15, 10, 1);
        String expected = "1";
        Assert.assertEquals(expected, actual.getAccuracyString());
    }

    @Test
    public void setBase() {
        PNumber actual = new PNumber(15, 10, 1);
        actual.setBase(11);
        int expected = 11;
        Assert.assertEquals(expected, actual.getBase());
    }

    @Test
    public void setAccuracy() {
        PNumber actual = new PNumber(15, 10, 1);
        actual.setAccuracy(2);
        int expected = 2;
        Assert.assertEquals(expected, actual.getAccuracy());
    }

    @Test
    public void setBaseString() {
        PNumber actual = new PNumber(15, 10, 1);
        actual.setBaseString("11");
        int expected = 11;
        Assert.assertEquals(expected, actual.getBase());
    }

    @Test
    public void setAccuracyString() {
        PNumber actual = new PNumber(15, 10, 1);
        actual.setAccuracyString("2");
        int expected = 2;
        Assert.assertEquals(expected, actual.getAccuracy());
    }

    @Test
    public void add() {
        PNumber pn1 = new PNumber(15, 10, 1);
        PNumber pn2 = new PNumber("A", "16", "1");
        PNumber actual = pn1.add(pn2);
        PNumber expected = new PNumber(25, 10, 1);
        Assert.assertEquals(expected.getNumber(), actual.getNumber(), 0.1);
        Assert.assertEquals(expected.getBase(), actual.getBase());
        Assert.assertEquals(expected.getAccuracy(), actual.getAccuracy());
    }

    @Test
    public void multiply() {
        PNumber pn1 = new PNumber(15, 10, 1);
        PNumber pn2 = new PNumber("A", "16", "1");
        PNumber actual = pn1.multiply(pn2);
        PNumber expected = new PNumber(150, 10, 1);
        Assert.assertEquals(expected.getNumber(), actual.getNumber(), 0.1);
        Assert.assertEquals(expected.getBase(), actual.getBase());
        Assert.assertEquals(expected.getAccuracy(), actual.getAccuracy());
    }

    @Test
    public void subtraction() {
        PNumber pn1 = new PNumber(15, 10, 1);
        PNumber pn2 = new PNumber("A", "16", "1");
        PNumber actual = pn1.subtraction(pn2);
        PNumber expected = new PNumber(5, 10, 1);
        Assert.assertEquals(expected.getNumber(), actual.getNumber(), 0.1);
        Assert.assertEquals(expected.getBase(), actual.getBase());
        Assert.assertEquals(expected.getAccuracy(), actual.getAccuracy());
    }

    @Test
    public void division() {
        PNumber pn1 = new PNumber(15, 10, 1);
        PNumber pn2 = new PNumber("A", "16", "1");
        PNumber actual = pn1.division(pn2);
        PNumber expected = new PNumber(1.5, 10, 1);
        Assert.assertEquals(expected.getNumber(), actual.getNumber(), 0.1);
        Assert.assertEquals(expected.getBase(), actual.getBase());
        Assert.assertEquals(expected.getAccuracy(), actual.getAccuracy());
    }

    @Test
    public void turnOver() {
        PNumber pn1 = new PNumber(15, 10, 1);
        PNumber actual = pn1.turnOver();
        PNumber expected = new PNumber((1 / 15), 10, 1);
        Assert.assertEquals(expected.getNumber(), actual.getNumber(), 0.1);
        Assert.assertEquals(expected.getBase(), actual.getBase());
        Assert.assertEquals(expected.getAccuracy(), actual.getAccuracy());
    }

    @Test
    public void square() {
        PNumber pn1 = new PNumber(15, 10, 1);
        PNumber actual = pn1.square();
        PNumber expected = new PNumber(225, 10, 1);
        Assert.assertEquals(expected.getNumber(), actual.getNumber(), 0.1);
        Assert.assertEquals(expected.getBase(), actual.getBase());
        Assert.assertEquals(expected.getAccuracy(), actual.getAccuracy());
    }
}