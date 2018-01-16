import org.junit.Assert;
import org.junit.Test;

public class AlphabetSoupTest {

    @Test
    public void testIsPossible() {
        AlphabetSoup alphabetSoup = new AlphabetSoup();
        Assert.assertFalse(alphabetSoup.isPossible("a", "b"));
    }
}
