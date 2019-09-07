import org.junit.Assert;
import org.junit.Test;

public class TestDrob {
    @Test
    public void testDrob(){
        Drob dr = new Drob(1, 3);
        Drob expected = new Drob("1/3");
        Assert.assertEquals(dr.getChis(), expected.getChis());
        Assert.assertEquals(dr.getZnam(), expected.getZnam());
    }

    @Test
    public void testSokr(){
        Drob dr = new Drob(5, 355);
        Drob expected = new Drob("1/71");
        dr.sokr();
        Assert.assertEquals(dr.getChis(), expected.getChis());
        Assert.assertEquals(dr.getZnam(), expected.getZnam());
    }

    @Test
    public void testCopy(){
        Drob dr = new Drob("1/3");
        Drob expected = new Drob();
        dr.copyDrob(expected);
        Assert.assertEquals(dr.getChis(), expected.getChis());
        Assert.assertEquals(dr.getZnam(), expected.getZnam());
    }

    @Test
    public void testSlozh(){
        Drob dr1 = new Drob("1/3");
        Drob dr2 = new Drob("4/3");
        Drob expected = new Drob("5/3");
        Drob res;
        res = dr1.slozh(dr2);
        Assert.assertEquals(res.getChis(), expected.getChis());
        Assert.assertEquals(res.getZnam(), expected.getZnam());
    }

    @Test
    public void testKvadrat(){
        Drob dr = new Drob("2/3");
        Drob expected = new Drob("4/9");
        Drob res;
        res = dr.kvadr();
        Assert.assertEquals(res.getChis(), expected.getChis());
        Assert.assertEquals(res.getZnam(), expected.getZnam());
    }

    @Test
    public void testMinus(){
        Drob dr = new Drob("1/3");
        Drob expected = new Drob();
        expected.setChis(-1);
        expected.setZnamen(3);
        Drob res = new Drob();
        res.copyDrob(dr.minus());
        Assert.assertEquals(res.getChis(), expected.getChis());
        Assert.assertEquals(res.getZnam(), expected.getZnam());
    }

    @Test
    public void testRavno(){
        Drob dr1 = new Drob("1/3");
        Drob dr2 = new Drob("1/3");
        Boolean expected = true;
        Boolean res;
        res = dr1.ravno(dr2);
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testBolshe(){
        Drob dr1 = new Drob("1/3");
        Drob dr2 = new Drob("2/4");
        Boolean expected = false;
        Boolean res;
        res = dr1.bolshe(dr2);
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testObratno(){
        Drob dr = new Drob("2/3");
        Drob expected = new Drob("3/2");
        Drob res;
        res = dr.obratno();
        Assert.assertEquals(res.getChis(), expected.getChis());
        Assert.assertEquals(res.getZnam(), expected.getZnam());
    }

    @Test
    public void testUmnoz(){
        Drob dr1 = new Drob("2/3");
        Drob dr2 = new Drob("4/5");
        Drob expected = new Drob("8/15");
        Drob res;
        res = dr1.umnoz(dr2);
        Assert.assertEquals(res.getChis(), expected.getChis());
        Assert.assertEquals(res.getZnam(), expected.getZnam());
    }

    @Test
    public void testDelen(){
        Drob dr1 = new Drob("2/3");
        Drob dr2 = new Drob("4/5");
        Drob expected = new Drob("5/6");
        Drob res;
        res = dr1.delen(dr2);
        res.sokr();
        Assert.assertEquals(res.getChis(), expected.getChis());
        Assert.assertEquals(res.getZnam(), expected.getZnam());
    }

    @Test
    public void testVichet(){
        Drob dr1 = new Drob("4/5");
        Drob dr2 = new Drob("2/3");
        Drob expected = new Drob("2/15");
        Drob res;
        res = dr1.vichet(dr2);
        res.sokr();
        Assert.assertEquals(res.getChis(), expected.getChis());
        Assert.assertEquals(res.getZnam(), expected.getZnam());
    }
}
