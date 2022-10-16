package leetcode.com.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTask01Test {

    private TwoSumTask01 task;

    @BeforeEach
    void setUp() {
        this.task = new TwoSumTask01();
    }

    @ParameterizedTest
    @MethodSource("makeArgs")
    void shouldFindTargetSum(int[] nums, int target, int[] expectedIndices) {
        assertThat(task.twoSum(nums, target))
                .containsExactlyInAnyOrder(expectedIndices);
    }

    private static Stream<Arguments> makeArgs() {
        var nums1 = new int[]{2, 7, 11, 15};
        var target1 = 9;
        var expectedIndices1 = new int[]{0, 1};
        var example1 = Arguments.of(nums1, target1, expectedIndices1);

        var nums2 = new int[]{3, 2, 4};
        var target2 = 6;
        var expectedIndices2 = new int[]{1, 2};
        var example2 = Arguments.of(nums2, target2, expectedIndices2);

        var nums3 = new int[]{3, 3};
        var target3 = 6;
        var expectedIndices3 = new int[]{0, 1};
        var example3 = Arguments.of(nums3, target3, expectedIndices3);


        return Stream.of(example1, example2, example3);
    }
}