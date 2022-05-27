package sparta.mk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void answerWithTrue()
    {
        Assertions.assertTrue( App.isPalindrome("madaM") );
    }
    @Test
    public void answerWithFalse()
    {
        Assertions.assertTrue( App.isPalindrome("&madaM") );
    }

}
