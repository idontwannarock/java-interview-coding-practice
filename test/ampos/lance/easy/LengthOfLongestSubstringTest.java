package ampos.lance.easy;

import org.junit.Before;
import org.junit.Test;

public class LengthOfLongestSubstringTest {

    private LengthOfLongestSubstring finder;

    @Before
    public void init() {
        finder = new LengthOfLongestSubstring();
    }

    @Test
    public void shouldReturnThree() {
        assert 3 == finder.lengthOfLongestSubstring("abcabcabc");
    }

    @Test
    public void shouldReturnOne() {
        assert 1 == finder.lengthOfLongestSubstring("aaaaa");
    }

    @Test
    public void shouldReturnFive() {
        assert 5 == finder.lengthOfLongestSubstring("arrghare");
    }
}
