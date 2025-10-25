import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsAiGeneratedTest {

    // ---------- Tests for reverseString ----------

    @Test
    public void testReverseString_Normal() {
        assertEquals("olleh", StringUtils.reverseString("hello"));
        assertEquals("avaJ", StringUtils.reverseString("Java"));
    }

    @Test
    public void testReverseString_Empty() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    public void testReverseString_SingleCharacter() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    @Test
    public void testReverseString_WithSpacesAndPunctuation() {
        assertEquals("!dlroW ,olleH", StringUtils.reverseString("Hello, World!"));
    }

    // ---------- Tests for capitalizeString ----------

    @Test
    public void testCapitalizeString_Normal() {
        assertEquals("Hello", StringUtils.capitalizeString("hello"));
        assertEquals("Java", StringUtils.capitalizeString("java"));
    }

    @Test
    public void testCapitalizeString_AlreadyCapitalized() {
        assertEquals("Hello", StringUtils.capitalizeString("Hello"));
    }

    @Test
    public void testCapitalizeString_SingleCharacter() {
        assertEquals("A", StringUtils.capitalizeString("a"));
        assertEquals("Z", StringUtils.capitalizeString("Z"));
    }

    @Test
    public void testCapitalizeString_EmptyOrNull() {
        assertNull(StringUtils.capitalizeString(null));
        assertEquals("", StringUtils.capitalizeString(""));
    }

    @Test
    public void testCapitalizeString_WithLeadingSpaces() {
        assertEquals(" hello", StringUtils.capitalizeString(" hello"));
    }

    // ---------- Tests for countOccurrences ----------

    @Test
    public void testCountOccurrences_Normal() {
        assertEquals(3, StringUtils.countOccurrences("banana", 'a'));
        assertEquals(0, StringUtils.countOccurrences("banana", 'x'));
    }

    @Test
    public void testCountOccurrences_EmptyString() {
        assertEquals(0, StringUtils.countOccurrences("", 'a'));
    }

    @Test
    public void testCountOccurrences_SpecialCharacters() {
        assertEquals(6, StringUtils.countOccurrences("$$$money$$$", '$'));
    }

    @Test
    public void testCountOccurrences_CaseSensitive() {
        assertEquals(1, StringUtils.countOccurrences("Apple", 'A'));
        assertEquals(0, StringUtils.countOccurrences("Apple", 'a'));
    }
}