import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTest {

    @Test
    public void testSum() {
        int a = 5;
        int b = 11;
        int result = a + b;
        assertEquals(15, result); // this is an assertion
        System.out.println("We just confirmed 5+10=15");
    }
}

