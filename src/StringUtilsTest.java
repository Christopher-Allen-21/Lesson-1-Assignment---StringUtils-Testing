import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void testReverseString1() {
        String input = "hello";
        String expected = "olleh";
        String actual = StringUtils.reverseString(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseString2() {
        String input = "";
        String expected = "";
        String actual = StringUtils.reverseString(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseString3() {
        String input = "hello";
        String expected = "asdf";
        String actual = StringUtils.reverseString(input);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testCapitalizeString1() {
        String input = "hello";
        String expected = "Hello";
        String actual = StringUtils.capitalizeString(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCapitalizeString2() {
        String input = "HeLlO";
        String expected = "HeLlO";
        String actual = StringUtils.capitalizeString(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCapitalizeString3() {
        String input = "Hello";
        String expected = "hello";
        String actual = StringUtils.capitalizeString(input);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testCountOccurrences1() {
        String input = "hello";
        char target = 'l';
        int expected = 2;
        int actual = StringUtils.countOccurrences(input, target);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountOccurrences2() {
        String input = "hello";
        char target = 'a';
        int expected = 0;
        int actual = StringUtils.countOccurrences(input, target);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountOccurrences3() {
        String input = "hello";
        char target = 'h';
        int expected = 0;
        int actual = StringUtils.countOccurrences(input, target);
        assertNotEquals(expected, actual);
    }
}
