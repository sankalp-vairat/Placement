package BinaryTree;

public class Density {

	public static int size=0;
	
	public static int max(int a,int b)
	{
		return (a>b?a:b);
	}
	public static int calculate(Node root)
	{
		if(root==null)
			return 0;
		size=size+1;
		return 1+max(calculate(root.left),calculate(root.right));
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.left.right.left = new Node(7);
        tree.root.left.right.right = new Node(8);
        
        int height=calculate(tree.root);
        System.out.println("Height"+"-"+height);
        System.out.println("Size"+"-"+size);
        double density=(double)size/height;
        System.out.println(density);
        //System.out.println(BinaryTree.root1);
	}
}