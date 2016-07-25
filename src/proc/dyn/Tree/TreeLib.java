package proc.dyn.Tree;

import java.lang.*;
/**
 * Created by Eugene on 25.07.2016.
 */
public class TreeLib {
	public static int size(TreeNode root) {
		return (root == null) ? 0 : 1 + size(root.left) + size(root.right);
	}

	public static int height(TreeNode root) {
		return (root == null) ? -1 : 1 + Math.max(height(root.left), height(root.right));
	}

	public static int sum(TreeNode root) {
		return (root == null) ? 0 : root.value + sum(root.left) + sum(root.right);
	}

	public static int max(TreeNode root) {
		return (root == null) ? 0 : Math.max(root.value, Math.max(max(root.left), max(root.right)));
	}
}
