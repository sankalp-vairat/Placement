package BinaryTree;

public class MakeMirror {

	
	public static void make(Node root)
	{
		if(root==null)
			return;
		Node temp=root.left;
		root.left=root.right;
		root.right=temp;
		make(root.left);
		make(root.right);
	}
	 
	 public static void inOrder(Node node) 
	 {
	    if (node == null) 
	    	return;
	    inOrder(node.left);
	    System.out.print(node.data);
	    inOrder(node.right);
	 }
	 
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        /* print inorder traversal of the input tree */
        System.out.println("Inorder traversal of input tree is :");
        inOrder(tree.root);
        System.out.println("");
 
        /* convert tree to its mirror */
        make(tree.root);
 
        /* print inorder traversal of the minor tree */
        System.out.println("Inorder traversal of binary tree is : ");
        inOrder(tree.root);
	}
}
