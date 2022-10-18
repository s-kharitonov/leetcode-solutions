package leetcode.com.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class HowManyNumbersAreSmallerThanCurrentNumberTest {

    private HowManyNumbersAreSmallerThanCurrentNumber task;

    @BeforeEach
    void setUp() {
        this.task = new HowManyNumbersAreSmallerThanCurrentNumber();
    }

    @ParameterizedTest
    @MethodSource("makeArgs")
    void shouldCountNumberSmallerThanCurrentNumber(int[] nums, int[] expectedCounts) {
        assertThat(task.smallerNumbersThanCurrent(nums))
                .containsExactly(expectedCounts);
    }

    private static Stream<Arguments> makeArgs() {
        var nums1 = new int[]{8, 1, 2, 2, 3};
        var expectedCounts1 = new int[]{4, 0, 1, 1, 3};
        var suite1 = Arguments.of(nums1, expectedCounts1);

        var nums2 = new int[]{6, 5, 4, 8};
        var expectedCounts2 = new int[]{2, 1, 0, 3};
        var suite2 = Arguments.of(nums2, expectedCounts2);

        var nums3 = new int[]{7, 7, 7, 7};
        var expectedCounts3 = new int[]{0, 0, 0, 0};
        var suite3 = Arguments.of(nums3, expectedCounts3);

        return Stream.of(suite1, suite2, suite3);
    }
}