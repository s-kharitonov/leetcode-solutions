package leetcode.com.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FindTargetIndicesAfterSortingArrayTest {

    private FindTargetIndicesAfterSortingArray task;

    @BeforeEach
    void setUp() {
        this.task = new FindTargetIndicesAfterSortingArray();
    }

    @ParameterizedTest
    @MethodSource("makeArgs")
    void shouldReturnListOfIndicesForTargetNum(int[] nums, int target, List<Integer> expectedIndices) {
        assertThat(task.targetIndices(nums, target))
                .containsExactly(expectedIndices.toArray(Integer[]::new));
    }

    private static Stream<Arguments> makeArgs() {
        var nums1 = new int[]{1, 2, 5, 2, 3};
        var target1 = 2;
        var expectedIndices1 = List.of(1, 2);
        var suite1 = Arguments.of(nums1, target1, expectedIndices1);

        var nums2 = new int[]{1, 2, 5, 2, 3};
        var target2 = 3;
        var expectedIndices2 = List.of(3);
        var suite2 = Arguments.of(nums2, target2, expectedIndices2);

        var nums3 = new int[]{1, 2, 5, 2, 3};
        var target3 = 5;
        var expectedIndices3 = List.of(4);
        var suite3 = Arguments.of(nums3, target3, expectedIndices3);

        return Stream.of(suite1, suite2, suite3);
    }
}