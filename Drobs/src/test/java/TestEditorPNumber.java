import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestEditorPNumber {

    @Test
    public void edit() {
        EditorPNumber ep = new EditorPNumber();
        String exception;
        String[] actual = {"-AB2", "", "AB20", "AB", "0.0", ""};
        for (int i = 0; i <= 5; i++) {
            if (i == 0) ep.setString("AB2");
            if (i == 1) continue;
            if (i == 2) ep.setString("AB2");
            if (i == 3) ep.setString("AB2");
            if (i == 4) ep.setString("AB2");
            exception = ep.edit(i);
            Assert.assertEquals(exception, actual[i]);
        }
    }
}