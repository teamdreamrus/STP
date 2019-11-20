import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestEditorFraction {

    @Test
    public void testEdit() {
        EditorFraction ef = new EditorFraction();
        String exception;
        String[] actual = {"1/3", "", "1/30", "1/3", "0/1", ""};
        for (int i = 0; i <= 5; i++) {
            if (i == 0) ef.setString("-1/3");
            if (i == 1) continue;
            if (i == 2) ef.setString("1/3");
            if (i == 3) ef.setString("1/30");
            if (i == 4) ef.setString("1/3");
            exception = ef.edit(i);
            Assert.assertEquals(exception, actual[i]);
        }
    }

}