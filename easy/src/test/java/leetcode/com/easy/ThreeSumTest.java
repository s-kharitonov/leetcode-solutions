package leetcode.com.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ThreeSumTest {

    private ThreeSum task;

    @BeforeEach
    void setUp() {
        this.task = new ThreeSum();
    }

    @ParameterizedTest
    @MethodSource("makeArgs")
    @SuppressWarnings("unchecked")
    void shouldFindThreeNumsWithZeroSum(int[] nums, List<List<Integer>> expectedTriplets) {
        assertThat(task.threeSum(nums))
                .containsExactlyInAnyOrder(expectedTriplets.toArray(List[]::new));
    }

    private static Stream<Arguments> makeArgs() {
        var nums1 = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expectedTriplets1 = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));
        var example1 = Arguments.of(nums1, expectedTriplets1);

        var nums2 = new int[]{0, 1, 1};
        List<List<Integer>> expectedTriplets2 = List.of();
        var example2 = Arguments.of(nums2, expectedTriplets2);

        var nums3 = new int[]{0, 0, 0};
        List<List<Integer>> expectedTriplets3 = List.of(List.of(0, 0, 0));
        var example3 = Arguments.of(nums3, expectedTriplets3);

        var nums4 = new int[]{0, 0, 0, 0};
        List<List<Integer>> expectedTriplets4 = List.of(List.of(0, 0, 0));
        var example4 = Arguments.of(nums4, expectedTriplets4);

        return Stream.of(example1, example2, example3, example4);
    }
}