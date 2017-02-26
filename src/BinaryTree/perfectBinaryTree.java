package BinaryTree;
/*
 * Check whether a binary tree is a pefect binary tree or not
 */
import java.util.LinkedList;

public class perfectBinaryTree {
	//using two queues
	public static boolean check(Node root)
	{
		float i=3;
		if(root==null)
			return false;
		if(root.left==null || root.right==null)
			return false;
		LinkedList<Node> queue_1=new LinkedList<Node>();
		LinkedList<Node> queue_2=new LinkedList<Node>();
		queue_1.addFirst(root);
		int level=1;
		while(!queue_1.isEmpty() || !queue_2.isEmpty())
		{
			while(!queue_1.isEmpty())
			{
				Node temp=queue_1.removeLast();
				if(temp.left!=null)
					queue_2.addFirst(temp.left);
				if(temp.right!=null)
					queue_2.addFirst(temp.right);
			}
			if((int)Math.pow(2, level)!=queue_2.size())
			{
				return false;
			}
			level++;
			while(!queue_2.isEmpty())
			{
				Node temp=queue_2.removeLast();
				if(temp.left!=null)
					queue_1.addFirst(temp.left);
				if(temp.right!=null)
					queue_1.addFirst(temp.right);
			}
			if((int)Math.pow(2, level)!=queue_1.size() && !queue_1.isEmpty())
			{
				return false;
			}
			level++;
		}
		return true;
	}
	//using one queue
	public static boolean width(Node root)
	{
		if(root==null)
			return true;
		int size=0;
		int width=0;
		int level=1;
		LinkedList<Node> queue=new LinkedList<Node>();
		queue.addFirst(root);
		while(!queue.isEmpty())
		{
			size=queue.size();
			if(width<size)
			{
				width=size;
			}
			while(size!=0)
			{
				Node temp=queue.removeLast();
				if(temp.left!=null)
					queue.addFirst(temp.left);
				if(temp.right!=null)
					queue.addFirst(temp.right);
				size--;
			}
			if((int)Math.pow(2, level)!=queue.size() && !queue.isEmpty())
			{
				return false;
			}
			level++;
		}
		return true;
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.right = new Node(40);
        tree.root.left.left = new Node(50);
        tree.root.right.left = new Node(60);
        tree.root.left.left.left = new Node(80);
        tree.root.right.right = new Node(70);
        tree.root.left.left.right = new Node(90);
        tree.root.left.right.left = new Node(80);
        tree.root.left.right.right = new Node(90);
        tree.root.right.left.left = new Node(80);
        tree.root.right.left.right = new Node(90);
        tree.root.right.right.left = new Node(80);
        tree.root.right.right.right = new Node(90);
        //tree.root.right.right.right./right = new Node(100);
        if(width(tree.root))
            System.out.println("yes");
        else
        	System.out.println("no");
	}
}