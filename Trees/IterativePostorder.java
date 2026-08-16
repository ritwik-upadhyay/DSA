import java.util.*;
public class IterativePostorder {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data) {
            this.data = data;
        }
    }
    public static void postorder(TreeNode root) {
        if(root==null) 
        {
            return;
        }
        Deque<TreeNode> stack1 = new ArrayDeque<>();
        Deque<TreeNode> stack2 = new ArrayDeque<>();
        stack1.push(root);
        while(!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);
            if(node.left!=null) {
                stack1.push(node.left);
            }
            if(node.right!=null) {
                stack1.push(node.right);
            }
        }
        while(!stack2.isEmpty()) {
                System.out.print(stack2.pop().data + " ");
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        postorder(root);
    }
}
