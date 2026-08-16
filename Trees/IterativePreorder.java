import java.util.*;
public class IterativePreorder {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data) {
            this.data = data;
        }
    }
    public static void preorder(TreeNode root) {
        if(root==null) 
        {
            return;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.data + " ");
            if(node.right!=null) {
                stack.push(node.right);
            }
            if(node.left!=null) {
                stack.push(node.left);
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        preorder(root);
    }
}
