package leetcode.com.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class JewelsAndStonesTest {

    private JewelsAndStones task;

    @BeforeEach
    void setUp() {
        this.task = new JewelsAndStones();
    }

    @ParameterizedTest
    @MethodSource("makeArgs")
    void shouldCalculateStones(String jewels, String stones, int expectedStonesCount) {
        assertThat(task.numJewelsInStones(jewels, stones))
                .isEqualTo(expectedStonesCount);
    }

    private static Stream<Arguments> makeArgs() {
        var jewels1 = "aA";
        var stones1 = "aAAbbbb";
        var expectedStonesCount1 = 3;
        var suite1 = Arguments.of(jewels1, stones1, expectedStonesCount1);

        var jewels2 = "z";
        var stones2 = "ZZ";
        var expectedStonesCount2 = 0;
        var suite2 = Arguments.of(jewels2, stones2, expectedStonesCount2);

        return Stream.of(suite1, suite2);
    }
}