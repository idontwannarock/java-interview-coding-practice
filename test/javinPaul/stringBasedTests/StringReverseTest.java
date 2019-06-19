package javinPaul.stringBasedTests;

import javinPaul.stringBasedQuestions.StringReverser;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class StringReverseTest {

    private StringReverser reverser;

    @Before
    public void init() {
        this.reverser = new StringReverser();
    }

    @Test
    public void inputEmptyStringShouldBeOk() {
        assertThat(reverser.reverse(""), is(StringUtils.EMPTY));
    }

    @Test
    public void inputOneWordStringShouldBeOk() {
        assertThat(reverser.reverse("a"), is("a"));
    }

    @Test
    public void inputRandomAlphabeticStringShouldBeReversed() {
        String randomString = RandomStringUtils.randomAlphabetic(10);
        assertThat(reverser.reverse(randomString), is(new StringBuilder(randomString).reverse().toString()));
    }

    @Test
    public void inputRandomNumericStringShouldBeReversed() {
        String randomString = RandomStringUtils.randomNumeric(10);
        assertThat(reverser.reverse(randomString), is(new StringBuilder(randomString).reverse().toString()));
    }

    @Test
    public void inputRandomNonAlphanumericStringShouldFail() {
        String randomString = generateRandomNonAlphanumericString(10);
        assertThat(reverser.reverse(randomString), not(new StringBuilder(randomString).reverse().toString()));
    }

    private String generateRandomNonAlphanumericString(int length) {
        String tempString = RandomStringUtils.random(length);
        StringBuilder result = new StringBuilder();
        while (!tempString.isEmpty() || result.toString().matches("[A-Za-z0-9]")) {
            result.append(tempString.replaceAll("[A-Za-z0-9]", ""));
            tempString = RandomStringUtils.random(length - result.length());
        }
        return result.toString();
    }

    @Test(expected = IllegalArgumentException.class)
    public void inputNullShouldShouldThrowIllegalArgumentException() throws IllegalArgumentException {
        reverser.reverse(null);
    }
}
