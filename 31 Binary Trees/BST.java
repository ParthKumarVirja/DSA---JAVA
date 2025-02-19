import javax.swing.tree.TreeNode;

public class BST {
    static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }
    public static Node insert(Node root, int data) {
        if(root == null) {
            root = new Node(data);
            return root;
        }
        if(root.val > data) {
            //left subtree
            root.left = insert(root.left,data);
        } else {
            //right st
            root.right = insert(root.right, data);
        }
        return root;

    }
    public Node searchBST(Node root, int val) {
        if(root == null) {
            return null;
        }
        if(root.val == val) {
            return root;
        }
        if(root.val > val) {
            return searchBST(root.left,val);
        } else {
            return searchBST(root.right,val);
        }
    }
    public static boolean isValidBST(Node root, Node min, Node max) {

        if(root == null)
            return true;

        if(min != null && root.val <= min.val)
            return false;

        else if(max != null && root.val >= max.val)
            return false;
        
        
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static Node createBST(int[] nums, int st, int end) {
        if(st > end)
            return null;
        int mid = (st+end)/2;
        Node root = new Node(nums[mid]);
        root.left = createBST(nums, st, mid-1);
        root.right = createBST(nums, mid+1, end);
        return root;
    }
    public Node deleteNode(Node root, int key) {
        if(root == null){
            return null;
        }
        if(root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if(root.val > key) {
            root.left = deleteNode(root.left, key);
        } else { // voila
            // case 1 Leaf node
            if(root.left == null && root.right == null)
                return null;
            //case 2 single node
            if(root.left == null)
                return root.right;
            if(root.right == null)
                return root.left;
            //case 3 two cilderen
            TreeNode IS = is(root.right);
            root.val = IS.val;
            root.right = deleteNode(root.right,IS.val);
        }
        return root;
            
    }
    public static Node is(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    public int rangeSumBST(Node root, int low, int high) {
        if (root == null) {
             return 0;
         }
         int sum = 0;
         if (root.val >= low && root.val <= high) {
             sum += root.val;
         }
         if (root.val > low) {
             sum += rangeSumBST(root.left, low, high);
         }
         if (root.val < high) {
             sum += rangeSumBST(root.right, low, high);
         }
         return sum;
     
     }
    
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0; i<values.length ; i++) {
            root = insert(root , values[i]);
        }
        inorder(root);
        System.out.println();

        // for validate BST
        if(isValidBST(root,null,null))
            System.out.println("Valid BST");
        else 
            System.out.println("Invalid BST");

        

    }
}