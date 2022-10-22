package leetcode.com.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FindSmallestLetterGreaterThanTargetTest {

    private FindSmallestLetterGreaterThanTarget task;

    @BeforeEach
    void setUp() {
        this.task = new FindSmallestLetterGreaterThanTarget();
    }

    @ParameterizedTest
    @MethodSource("makeArgs")
    void shouldFindNextGreatestLetter(char[] letters, char target, char expectedChar) {
        assertThat(task.nextGreatestLetter(letters, target))
                .isEqualTo(expectedChar);
    }

    private static Stream<Arguments> makeArgs() {
        var letters1 = new char[]{'c', 'f', 'j'};
        var target1 = 'a';
        var expectedChar1 = 'c';
        var suite1 = Arguments.of(letters1, target1, expectedChar1);

        var letters2 = new char[]{'c', 'f', 'j'};
        var target2 = 'c';
        var expectedChar2 = 'f';
        var suite2 = Arguments.of(letters2, target2, expectedChar2);

        var letters3 = new char[]{'x', 'x', 'y', 'y'};
        var target3 = 'z';
        var expectedChar3 = 'x';
        var suite3 = Arguments.of(letters3, target3, expectedChar3);

        return Stream.of(suite1, suite2, suite3);
    }
}