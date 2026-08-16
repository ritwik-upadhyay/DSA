package Trees;
import java.util.*;
public class IterativeInorder {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data) {
            this.data = data;
        }
    }
    public static void inorder(TreeNode root) {
        if(root==null) {
            return;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode current = root;
        while(current!=null || !stack.isEmpty()) {
            while(current!=null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.data + " ");
            current = current.right;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        inorder(root);
    }

}
