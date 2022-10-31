package leetcode.com.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayPartitionTest {

    private ArrayPartition task;

    @BeforeEach
    void setUp() {
        this.task = new ArrayPartition();
    }

    @ParameterizedTest
    @MethodSource("makeArgs")
    void shouldReturnArrayPairSum(int[] nums, int expectedSum) {
        assertThat(task.arrayPairSum(nums))
                .isEqualTo(expectedSum);
    }

    private static Stream<Arguments> makeArgs() {
        var nums1 = new int[]{1, 4, 3, 2};
        var expectedSum1 = 4;
        var suite1 = Arguments.of(nums1, expectedSum1);

        var nums2 = new int[]{6, 2, 6, 5, 1, 2};
        var expectedSum2 = 9;
        var suite2 = Arguments.of(nums2, expectedSum2);

        return Stream.of(suite1, suite2);
    }
}