package BinaryTree;

import java.util.LinkedList;

public class WidthBT {

	//using two queue
	public static int check(Node root)
	{
		if(root==null)
			return 0;
		//if(root.left==null || root.right==null)
			//return 1;
		LinkedList<Node> queue_1=new LinkedList<Node>();
		LinkedList<Node> queue_2=new LinkedList<Node>();
		int max=1;
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
			
			if(max<queue_2.size())
			{
				max=queue_2.size();
			}
			while(!queue_2.isEmpty())
			{
				Node temp=queue_2.removeLast();
				if(temp.left!=null)
					queue_1.addFirst(temp.left);
				if(temp.right!=null)
					queue_1.addFirst(temp.right);
			}
			if(max<queue_1.size())
			{
				max=queue_1.size();
			}
		}
		return max;
	}
	//using one queue
	public static int width(Node root)
	{
		if(root==null)
			return 0;
		int size=0;
		int width=0;
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
		}
		return width;
	}
	
	public static void main(String[] args) {
		/*BinaryTree tree = new BinaryTree();
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
        tree.root.right.right.right.right = new Node(100);*/
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(8);
        tree.root.right.right.left = new Node(6);
        tree.root.right.right.right = new Node(7);
        System.out.println(width(tree.root));
	}
}
