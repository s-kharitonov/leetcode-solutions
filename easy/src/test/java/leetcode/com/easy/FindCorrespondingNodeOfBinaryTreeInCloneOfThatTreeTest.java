package leetcode.com.easy;

import leetcode.com.easy.model.task_1379.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FindCorrespondingNodeOfBinaryTreeInCloneOfThatTreeTest {

    private FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree task;

    @BeforeEach
    void setUp() {
        this.task = new FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree();
    }

    @ParameterizedTest
    @MethodSource("makeArgs")
    void shouldFindTarget(TreeNode original, TreeNode cloned, TreeNode target, TreeNode expectedNode) {
        assertThat(task.getTargetCopy(original, cloned, target))
                .isEqualTo(expectedNode);
    }

    private static Stream<Arguments> makeArgs() {
        return Stream.of(
                makeArgsForFirstExample(),
                makeArgsForSecondExample(),
                makeArgsForThirdExample()
        );
    }

    private static Arguments makeArgsForFirstExample() {
        var fifthNode = new TreeNode(19);
        var fourthNode = new TreeNode(6);
        var thirdNode = new TreeNode(3);

        thirdNode.left = fourthNode;
        thirdNode.right = fifthNode;

        var secondNode = new TreeNode(4);
        var firstNode = new TreeNode(7);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;

        var cloned = firstNode.clone();
        var clonedThirdNode = cloned.right;

        return Arguments.of(firstNode, cloned, thirdNode, clonedThirdNode);
    }

    private static Arguments makeArgsForSecondExample() {
        var firstNode = new TreeNode(7);
        var cloned = firstNode.clone();

        return Arguments.of(firstNode, cloned, firstNode, cloned);
    }

    private static Arguments makeArgsForThirdExample() {
        var seventhNode = new TreeNode(1);
        var sixthNode = new TreeNode(2);

        sixthNode.right = seventhNode;

        var fifthNode = new TreeNode(3);

        fifthNode.right = sixthNode;

        var fourthNode = new TreeNode(4);

        fourthNode.right = fifthNode;

        var thirdNode = new TreeNode(5);

        thirdNode.right = fourthNode;

        var secondNode = new TreeNode(6);

        secondNode.right = thirdNode;

        var firstNode = new TreeNode(8);

        firstNode.right = secondNode;

        var cloned = firstNode.clone();
        var clonedFourthNode = cloned.right
                .right
                .right;

        return Arguments.of(firstNode, cloned, fourthNode, clonedFourthNode);
    }
}