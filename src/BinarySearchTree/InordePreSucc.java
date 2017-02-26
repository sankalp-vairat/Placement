package BinarySearchTree;
import java.util.Stack;

public class InordePreSucc {

	public static void inorder(Node root,int data)
	{
		Stack<Node> s=new Stack<Node>();
		if(root==null)
			return;
		if(root.left==null && root.right==null)
			return;
		if(root.data==data && root.left==null)
		{
			System.out.println("Successor is:"+root.right);
			return;
		}
		if(root.data==data && root.right==null)
		{
			System.out.println("Predesessor is:"+root.left);
			return;
		}
		if(root.data==data && root.right!=null && root.left!=null)
		{
			System.out.println("Successor is:"+root.right);
			System.out.println("Predesessor is:"+root.left);
			return;
		}
		s.push(root);
		while(!s.isEmpty())
		{
			Node temp=s.peek();
			if(temp.left!=null && temp.left.data==data)
			{
				System.out.println("Successor is:"+root.right);
				System.out.println("Predesessor is:"+root.left.left);
				break;
			}
				
		}
		
	}
	
	public static void inorder(Node root)
	{
		if(root==null)
			return;
	}
	
	public static void main(String[] args) {
		
	}
}
