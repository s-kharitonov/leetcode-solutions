package leetcode.com.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CheckIfSentenceIsPangramTest {

    private CheckIfSentenceIsPangram task;

    @BeforeEach
    void setUp() {
        this.task = new CheckIfSentenceIsPangram();
    }

    @ParameterizedTest
    @MethodSource("makeArgs")
    void shouldCheckSentenceIsPangram(String sentence, boolean expectedIsPangram) {
        assertThat(task.checkIfPangram(sentence))
                .isEqualTo(expectedIsPangram);
    }

    private static Stream<Arguments> makeArgs() {
        var sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        var expectedIsPangram1 = true;
        var suite1 = Arguments.of(sentence1, expectedIsPangram1);

        var sentence2 = "leetcode";
        var expectedIsPangram2 = false;
        var suite2 = Arguments.of(sentence2, expectedIsPangram2);

        return Stream.of(suite1, suite2);
    }
}