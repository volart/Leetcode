package me.volart;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a n-ary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * Note:
 * <p>
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000.
 */
public class App {
  public static void main(String[] args) {

    List<Node> leaves56 = new ArrayList<>();
    Node leaf5 = new Node(5, null);
    Node leaf6 = new Node(6, null);
    leaves56.add(leaf5);
    leaves56.add(leaf6);

    Node leaf3 = new Node(5, leaves56);

    Node leaf2 = new Node(2, null);
    Node leaf4 = new Node(4, null);
    List<Node> leaves234 = new ArrayList<>();
    leaves234.add(leaf3);
    leaves234.add(leaf2);
    leaves234.add(leaf4);

    Node root = new Node(1, leaves234);

    int maxDepth = maxDepth(root);
    System.out.println(maxDepth);
  }

  public static int maxDepth(Node root) {
    int res = 0;
    if (root == null) {
      return res;
    }
    res++;
    int max = 0;
    if (root.children != null) {
      for (Node child : root.children) {
        int cMax = maxDepth(child);
        if (max < cMax) {
          max = cMax;
        }
      }
    }
    return res + max;
  }
}
