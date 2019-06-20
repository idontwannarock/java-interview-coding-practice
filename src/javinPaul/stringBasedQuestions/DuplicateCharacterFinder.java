package javinPaul.stringBasedQuestions;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class DuplicateCharacterFinder {

    // 2. How do you print duplicate characters from a string?

    public List<String> findDuplicate(final String input) {
        if (input == null || input.isEmpty() || input.trim().isEmpty()) {
            return new ArrayList<>();
        }
        Set<String> existingCharacters = new HashSet<>();
        Set<String> duplicatedCharacters = new HashSet<>();
        Arrays.stream(input.split("")).filter(c -> !c.equals(StringUtils.SPACE)).forEachOrdered(c -> {
            if (!existingCharacters.contains(c)) existingCharacters.add(c);
            else duplicatedCharacters.add(c);
        });
        return new ArrayList<>(duplicatedCharacters);
    }

    public Map<String, Integer> findDuplicateAndCount(final String input) {
        Map<String, Integer> duplicateCount = new HashMap<>();
        if (input == null || input.isEmpty() || input.trim().isEmpty()) {
            return duplicateCount;
        }
        Map<String, Integer> characterCount = new HashMap<>();
        Arrays.stream(input.split("")).forEachOrdered(c -> {
            if (!characterCount.containsKey(c)) {
                characterCount.put(c, 1);
            } else {
                characterCount.replace(c, characterCount.get(c) + 1);
                duplicateCount.replace(c, characterCount.get(c));
            }
        });
        return duplicateCount;
    }
}
