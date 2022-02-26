import com.learing.Second;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalidnromeTest {

    @Test
    public void testPalidnrome() {
        assertTrue(Second.isPalindrome("abba"));
        assertTrue(Second.isPalindrome(" abba"));
        assertTrue(Second.isPalindrome(" abba "));
        assertTrue(Second.isPalindrome("abba"));
        assertTrue(Second.isPalindrome(" a bba"));
        assertTrue(Second.isPalindrome("aba"));
        assertFalse(Second.isPalindrome("abc"));

    }

}
