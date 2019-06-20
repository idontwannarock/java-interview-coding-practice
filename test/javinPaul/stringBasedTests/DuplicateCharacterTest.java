package javinPaul.stringBasedTests;

import javinPaul.stringBasedQuestions.DuplicateCharacterFinder;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DuplicateCharacterTest {

    @Test
    public void inputEmptyStringShouldBeOk() {
        assertThat(new DuplicateCharacterFinder().findDuplicate(StringUtils.EMPTY), is(new ArrayList<>()));
    }

    @Test
    public void inputNullShouldBeOk() {
        assertThat(new DuplicateCharacterFinder().findDuplicate(null), is(new ArrayList<>()));
    }

    @Test
    public void inputAAShouldBeA() {
        List<String> expectedCharacters = new ArrayList<>();
        expectedCharacters.add("A");
        assertThat(new DuplicateCharacterFinder().findDuplicate("AA"), is(expectedCharacters));
    }

    @Test
    public void inputAABShouldBeA() {
        List<String> expectedCharacters = new ArrayList<>();
        expectedCharacters.add("A");
        assertThat(new DuplicateCharacterFinder().findDuplicate("AAB"), is(expectedCharacters));
    }

    @Test
    public void inputShouldIgnoreSpace() {
        List<String> expectedCharacters = new ArrayList<>();
        expectedCharacters.add("A");
        assertThat(new DuplicateCharacterFinder().findDuplicate("A A"), is(expectedCharacters));
    }

    @Test
    public void inputShouldBeCaseSensitive() {
        List<String> expectedCharacters = new ArrayList<>();
        expectedCharacters.add("A");
        expectedCharacters.add("a");
        assertThat(new DuplicateCharacterFinder().findDuplicate("A Aa ab"), is(expectedCharacters));
    }
}
