import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestEditorComplex {

    @Test
    public void edit() {
        EditorComplex ec = new EditorComplex();
        String exception;
        String[] actual = {"1.0+2.0i", "", "1.0+2.20i", "1.0+2.i", "0.0+0.0i", ""};
        for (int i = 0; i <= 5; i++) {
            if (i == 0) ec.setString("-1.0+2.0i");
            if (i == 1) continue;
            if (i == 2) ec.setString("1.0+2.2i");
            if (i == 3) ec.setString("1.0+2.2i");
            if (i == 4) ec.setString("1.0+2.2i");
            exception = ec.edit(i);
            Assert.assertEquals(exception, actual[i]);
        }
    }
}