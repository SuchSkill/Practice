package proc.dyn.Tree;

/**
 * Created by Eugene on 25.07.2016.
 */
public class TestTreeLib {
	public static void main(String[] args) {
		TreeNode tn = new TreeNode(1, new TreeNode(2, null,null), new TreeNode(3, new TreeNode(4, null,null),null));
		System.out.println(TreeLib.size(tn));
		System.out.println(TreeLib.height(tn));
		System.out.println(TreeLib.sum(tn));
		System.out.println(TreeLib.max(tn));
	}
}
