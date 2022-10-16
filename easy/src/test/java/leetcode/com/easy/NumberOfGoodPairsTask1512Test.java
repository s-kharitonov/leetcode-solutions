package leetcode.com.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfGoodPairsTask1512Test {

    private NumberOfGoodPairsTask1512 numberOfGoodPairsTask1512;

    @BeforeEach
    void setUp() {
        this.numberOfGoodPairsTask1512 = new NumberOfGoodPairsTask1512();
    }

    @ParameterizedTest
    @MethodSource("makeArgs")
    void shouldReturnNumberOfGoodPairs(int[] nums, int expectedPairsNumber) {
        assertThat(numberOfGoodPairsTask1512.numIdenticalPairs(nums))
                .isEqualTo(expectedPairsNumber);
    }

    private static Stream<Arguments> makeArgs() {
        var nums1 = new int[]{1, 2, 3, 1, 1, 3};
        var expectedPairsNumber1 = 4;
        var suite1 = Arguments.of(nums1, expectedPairsNumber1);

        var nums2 = new int[]{1, 1, 1, 1};
        var expectedPairsNumber2 = 6;
        var suite2 = Arguments.of(nums2, expectedPairsNumber2);

        var nums3 = new int[]{1, 2, 3};
        var expectedPairsNumber3 = 0;
        var suite3 = Arguments.of(nums3, expectedPairsNumber3);

        return Stream.of(suite1, suite2, suite3);
    }
}