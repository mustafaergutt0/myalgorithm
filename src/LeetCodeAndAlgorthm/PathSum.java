package LeetCodeAndAlgorthm;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;

public class PathSum {

    static void main() {



    }

    public class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

    }


    static public boolean hasPathSum(TreeNode root, int target) {
        if (root == null) return false;
        if(root.left==null && root.right==null){
            return target==root.val;
        }

        return hasPathSum(root.left, target-root.val) ||  hasPathSum(root.right, target-root.val);
        // ne yapakca bu herhangi bri yol var mı yolu içindeki toplamlar target eşitmi diye bakıyrouz
    }
}
