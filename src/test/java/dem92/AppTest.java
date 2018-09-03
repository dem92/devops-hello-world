package dem92;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( App.helloGenerator().equals("Hello world!") );
    }

    @Test
    public void shouldFail()
    {
        assertTrue( App.helloGenerator().equals("Bye!") );
    }
}
