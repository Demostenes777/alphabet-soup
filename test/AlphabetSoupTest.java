import org.junit.Assert;
import org.junit.Test;

public class AlphabetSoupTest {

    @Test
    public void testIsPossible() {

        AlphabetSoup alphabetSoup = new AlphabetSoup();

        Assert.assertTrue(alphabetSoup.isPossible("a", "a"));
        Assert.assertFalse(alphabetSoup.isPossible("a", "b"));
        Assert.assertTrue(alphabetSoup.isPossible("a", "ab"));
        Assert.assertTrue(alphabetSoup.isPossible("ab", "ab"));
        Assert.assertFalse(alphabetSoup.isPossible("ab", "bc"));
        Assert.assertTrue(alphabetSoup.isPossible("ab", "aab"));
        Assert.assertTrue(alphabetSoup.isPossible("ab", "abc"));
        Assert.assertFalse(alphabetSoup.isPossible("ab", "cdb"));
        Assert.assertTrue(alphabetSoup.isPossible("hello", "ahbelol"));
        Assert.assertFalse(alphabetSoup.isPossible("hello", "ahbeol"));
        Assert.assertFalse(alphabetSoup.isPossible("HelloWorld", "ahlbeol"));
        Assert.assertTrue(alphabetSoup.isPossible("HelloWorld", "HahlbeolWorld"));
        Assert.assertTrue(alphabetSoup.isPossible("abc", "aabbcc"));
        Assert.assertTrue(alphabetSoup.isPossible("c", "aabbcc"));
        Assert.assertTrue(alphabetSoup.isPossible("d", "aabbccd"));

    }
}
