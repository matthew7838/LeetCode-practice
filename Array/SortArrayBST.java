import javax.swing.tree.TreeNode;
import java.util.Arrays;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class SortArrayBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        //base case
        if(n==2){//two left: compare if second element to the right or left
            TreeNode root = new TreeNode(nums[0]);
            if(nums[0] > nums[1]){
                root.left = new TreeNode(nums[1]);
            }else{
                root.right = new TreeNode(nums[1]);
            }
            return root;
        }else if(n<2){//one left : pnly node
            TreeNode root = new TreeNode(nums[0]);
            return root;
        }else{//recursive case
            int p = n / 2;
            TreeNode root = new TreeNode(nums[p]);
            root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, p));//recursive on the left half
            root.right = sortedArrayToBST(Arrays.copyOfRange(nums, p+1, n));//recursive on the right half(skip p since it's already added)
            return root;
        }
    }
}
