package BinaryTree;

public class Mirror {

	public static boolean check(Node root_1,Node root_2)
	{
		if(root_1==null && root_2==null)
			return true;
		if(root_1==null||root_2==null)
			return false;
		if(root_1.data!=root_2.data)
			return false;
		return (check(root_1.left,root_2.right)&&check(root_1.right,root_2.left));
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
 
        tree.root1 = new Node(1);
        tree.root1.left = new Node(3);
        tree.root1.right = new Node(2);
        tree.root1.right.left = new Node(5);
        tree.root1.right.right = new Node(4);
        tree.root1.left.right = new Node(6);
        tree.root1.right.left.left = new Node(8);
        tree.root1.right.left.right = new Node(7);
 
        if (check(tree.root, tree.root1) == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}
}
