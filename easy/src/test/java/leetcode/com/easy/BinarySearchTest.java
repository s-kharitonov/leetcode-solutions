package leetcode.com.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

    private BinarySearch task;

    @BeforeEach
    void setUp() {
        this.task = new BinarySearch();
    }

    @ParameterizedTest
    @MethodSource("makeArgs")
    void shouldFindTargetIndexInSortedArray(int[] nums, int target, int expectedIndex) {
        assertThat(task.search(nums, target))
                .isEqualTo(expectedIndex);
    }

    private static Stream<Arguments> makeArgs() {
        var nums1 = new int[]{-1, 0, 3, 5, 9, 12};
        var target1 = 9;
        var expectedIndex1 = 4;
        var suite1 = Arguments.of(nums1, target1, expectedIndex1);

        var nums2 = new int[]{-1, 0, 3, 5, 9, 12};
        var target2 = 2;
        var expectedIndex2 = -1;
        var suite2 = Arguments.of(nums2, target2, expectedIndex2);

        return Stream.of(suite1, suite2);
    }
}