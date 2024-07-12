import org.junit.Test;

import static org.junit.Assert.assertEquals;

//This is a unit test that is used to validate that the logic of a small part of the program is correct.
// In this scenario, it's testing that the sum of 5 and 10 is indeed 15.
// If the assertion is not true, an error will be thrown, indicating that there's a bug in the code that needs to be fixed.
public class UnitTestWithComments {

    @Test
    public void testSum() {
        //The code first defines three integers: `a`, `b`, and `result`. `a` is assigned the value of 5,
        // `b` is assigned the value of 10,
        // and then `result` is calculated by adding `a` and `b` together.
        int a = 5;
        int b = 10;
        int result = a + b;
        //If `result` is indeed 15, the `assertEquals()` function will not produce an error,
        // and the program will print "We just confirmed 5+10=15" to the console.
        // However, if `result` is not 15, the `assertEquals()` function will throw an AssertionError,
        // causing the test to fail,// and the print statement will not be executed.
        assertEquals(15, result); // this is an assertion
        System.out.println("We just confirmed 5+10=15");
    }
}
