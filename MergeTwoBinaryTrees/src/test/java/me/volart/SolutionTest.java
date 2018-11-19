package me.volart;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void mergeTrees() {
    TreeNode t1 = new TreeNode(1);
    t1.right = new TreeNode(2);
    t1.left = new TreeNode(3);
    t1.left.left = new TreeNode(5);

    TreeNode t2 = new TreeNode(2);
    t2.right = new TreeNode(3);
    t2.left = new TreeNode(1);
    t2.right.right = new TreeNode(7);
    t2.left.right = new TreeNode(4);

    TreeNode treeNode = solution.mergeTrees(t1, t2);
    System.out.println();
  }
}