import org.junit.Assert;
import org.junit.Test;

public class TestFraction {
    @Test
    public void testFraction() {
        Fraction dr = new Fraction(1, 3);
        Fraction expected = new Fraction("1/3");
        Assert.assertEquals(dr.getNumerator(), expected.getNumerator());
        Assert.assertEquals(dr.getDenominator(), expected.getDenominator());
    }

    @Test
    public void testReduction() {
        Fraction dr = new Fraction(5, 355);
        Fraction expected = new Fraction("1/71");
        dr.reduction();
        Assert.assertEquals(dr.getNumerator(), expected.getNumerator());
        Assert.assertEquals(dr.getDenominator(), expected.getDenominator());
    }

    @Test
    public void testCopy() {
        Fraction dr = new Fraction("1/3");
        Fraction expected = dr.clone();
        Assert.assertEquals(dr.getNumerator(), expected.getNumerator());
        Assert.assertEquals(dr.getDenominator(), expected.getDenominator());
    }

    @Test
    public void testAdd() {
        Fraction dr1 = new Fraction("1/3");
        Fraction dr2 = new Fraction("4/3");
        Fraction expected = new Fraction("5/3");
        Fraction res;
        res = dr1.add(dr2);
        Assert.assertEquals(res.getNumerator(), expected.getNumerator());
        Assert.assertEquals(res.getDenominator(), expected.getDenominator());
    }

    @Test
    public void testSquare() {
        Fraction dr = new Fraction("2/3");
        Fraction expected = new Fraction("4/9");
        Fraction res;
        res = dr.square();
        Assert.assertEquals(res.getNumerator(), expected.getNumerator());
        Assert.assertEquals(res.getDenominator(), expected.getDenominator());
    }

    @Test
    public void testMinus() {
        Fraction dr = new Fraction("1/3");
        dr = dr.minus();
        Fraction expected = new Fraction(-1, 3);
//        expected.multiply(-1);
        Assert.assertEquals(dr.getNumerator(), expected.getNumerator());
        Assert.assertEquals(dr.getDenominator(), expected.getDenominator());
    }

    @Test
    public void testEqually() {
        Fraction dr1 = new Fraction("1/3");
        Fraction dr2 = new Fraction("1/3");
        Boolean res = dr1.equally(dr2);
        Assert.assertEquals(res, true);
    }

    @Test
    public void testisMoreThen() {
        Fraction dr1 = new Fraction("1/3");
        Fraction dr2 = new Fraction("2/4");
        Boolean res = dr1.isMoreThen(dr2);
        Assert.assertEquals(res, false);
    }

    @Test
    public void testTurnOver() {
        Fraction dr = new Fraction("2/3");
        Fraction expected = new Fraction("3/2");
        Fraction res = dr.turnOver();
        Assert.assertEquals(res.getNumerator(), expected.getNumerator());
        Assert.assertEquals(res.getDenominator(), expected.getDenominator());
    }

    @Test
    public void testMultiply() {
        Fraction dr1 = new Fraction("2/3");
        Fraction dr2 = new Fraction("4/5");
        Fraction expected = new Fraction("8/15");
        Fraction res = dr1.multiply(dr2);
        Assert.assertEquals(res.getNumerator(), expected.getNumerator());
        Assert.assertEquals(res.getDenominator(), expected.getDenominator());
    }

    @Test
    public void testDivision() {
        Fraction dr1 = new Fraction("2/3");
        Fraction dr2 = new Fraction("4/5");
        Fraction expected = new Fraction("5/6");
        Fraction res = dr1.division(dr2);
        Assert.assertEquals(res.getNumerator(), expected.getNumerator());
        Assert.assertEquals(res.getDenominator(), expected.getDenominator());
    }

    @Test
    public void testSubtraction() {
        Fraction dr1 = new Fraction("4/5");
        Fraction dr2 = new Fraction("2/3");
        Fraction expected = new Fraction("2/15");
        Fraction res = dr1.subtraction(dr2);
        Assert.assertEquals(res.getNumerator(), expected.getNumerator());
        Assert.assertEquals(res.getDenominator(), expected.getDenominator());
    }
}
