package BinaryTree;

public class sumOfLeft {

	static int sum1=0;
	public static void sum(Node root)
	{
		if(root==null)
			return;
		if(root.left!=null && root.left.left==null && root.left.right==null)
		 sum1=sum1+root.left.data;
		sum(root.left);
		sum(root.right);
		
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
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
        tree.root.left.right.right.right.right = new Node(15);
		 /*BinaryTree tree = new BinaryTree();
	        tree.root = new Node(20);
	        tree.root.left = new Node(9);
	        tree.root.right = new Node(49);
	        tree.root.left.right = new Node(12);
	        tree.root.left.left = new Node(5);
	        tree.root.right.left = new Node(23);
	        tree.root.right.right = new Node(52);
	        tree.root.left.right.right = new Node(12);
	        tree.root.right.right.left = new Node(50);*/
        sum(tree.root);
		System.out.println(sum1);
	}


}
