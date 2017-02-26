package BinaryTree;
/*
 * Calculate diameter of a tree
 */
public class Diameter {
	
	static int max=0;
	
	public static int diameter(Node root)
	{
		if(root==null)
			return 0;
			int lheight=diameter(root.left);
			int rheight=diameter(root.right);
			if((lheight+rheight)>max)
				max=lheight+rheight;
			if(lheight>rheight)
				return lheight+1;
			else
				return rheight+1;			
	}
	
	public static void main(String args[])
    {
        /*BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right=new Node(6);
        tree.root.left.left.left = new Node(7);
        tree.root.left.left.right = new Node(8);
        tree.root.left.right.right = new Node(9);
        tree.root.left.left.right.left = new Node(10);
        tree.root.left.right.right.left = new Node(11);
        tree.root.left.right.right.right = new Node(12);
        tree.root.left.left.right.left.left = new Node(13);
        tree.root.left.left.right.left.right = new Node(14);
        tree.root.left.right.right.right.right = new Node(15);*/
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        diameter( tree.root);
        System.out.println("The diameter of given binary tree is : "
                           + (max+1));
    }
}
