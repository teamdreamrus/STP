import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPoly {
    @Test
    public void power() {
        ArrayList<TMember> members1 = new ArrayList<>();
        members1.add(new TMember(3, 2));
        members1.add(new TMember(1, 1));
        Assert.assertEquals(2, new TPoly(members1).power());
    }

    @Test
    public void add_2_ELEMENTS() {
        ArrayList<TMember> members1 = new ArrayList<>();
        members1.add(new TMember(3, 2));
        members1.add(new TMember(6, 4));
        ArrayList<TMember> members2 = new ArrayList<>();
        members2.add(new TMember(3, 2));
        members2.add(new TMember(6, 4));
        TPoly pol1 = new TPoly(members1);
        TPoly pol2 = new TPoly(members2);
        Assert.assertEquals("6x^2+12x^4", pol1.add(pol2).getPolinom());
    }

    @Test
    public void add_4_ELEMENTS() {
        ArrayList<TMember> members1 = new ArrayList<>();
        members1.add(new TMember(3, 2));
        members1.add(new TMember(6, 4));
        members1.add(new TMember(2, 5));
        members1.add(new TMember(5, 3));
        ArrayList<TMember> members2 = new ArrayList<>();
        members2.add(new TMember(3, 2));
        members2.add(new TMember(6, 4));
        members2.add(new TMember(2, 5));
        members2.add(new TMember(5, 3));
        TPoly pol1 = new TPoly(members1);
        TPoly pol2 = new TPoly(members2);
        Assert.assertEquals("6x^2+10x^3+12x^4+4x^5", pol1.add(pol2).getPolinom());
    }

    @Test
    public void subtract() {
        ArrayList<TMember> members1 = new ArrayList<>();
        members1.add(new TMember(5, 2));
        members1.add(new TMember(9, 4));
        members1.add(new TMember(8, 5));
        members1.add(new TMember(11, 3));
        ArrayList<TMember> members2 = new ArrayList<>();
        members2.add(new TMember(3, 2));
        members2.add(new TMember(6, 4));
        members2.add(new TMember(2, 5));
        members2.add(new TMember(5, 3));
        TPoly pol1 = new TPoly(members1);
        TPoly pol2 = new TPoly(members2);
        Assert.assertEquals("2x^2+6x^3+3x^4+6x^5", pol1.subtract(pol2).getPolinom());
    }

    @Test
    public void multiply() {
        ArrayList<TMember> members1 = new ArrayList<>();
        members1.add(new TMember(5, 2));
        members1.add(new TMember(8, 5));
        ArrayList<TMember> members2 = new ArrayList<>();
        members2.add(new TMember(3, 2));
        members2.add(new TMember(2, 5));
        TPoly pol1 = new TPoly(members1);
        TPoly pol2 = new TPoly(members2);
        Assert.assertEquals("10x^9+13x^12", pol1.multiply(pol2).getPolinom());
    }

    @Test
    public void minus() {
        ArrayList<TMember> members1 = new ArrayList<>();
        members1.add(new TMember(5, 2));
        members1.add(new TMember(8, 5));
        TPoly pol1 = new TPoly(members1);
        Assert.assertEquals("-5x^2-8x^5", pol1.minus().getPolinom());
    }

    @Test
    public void elementAt() {
        ArrayList<TMember> members1 = new ArrayList<>();
        members1.add(new TMember(5, 2));
        members1.add(new TMember(8, 5));
        TPoly pol1 = new TPoly(members1);
        Assert.assertEquals("8x^5", pol1.elementAt(1));
    }

}
