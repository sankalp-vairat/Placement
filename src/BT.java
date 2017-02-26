import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Iterator;
public class BT {

	private int data;
	private BT left;
	private BT right;
	
	public BT() {
		// TODO Auto-generated constructor stub
	}
	
	public BT(int data,BT left,BT right)
	{
		this.data=data;
		this.left=left;
		this.right=right;
	}
	public void setData(int data)
	{
		this.data=data;
	}
	public int getData()
	{
		return this.data;	
	}	
	public void setLeft(BT left)
	{
		this.left=left;
	}
	public BT getLeft()
	{
		return this.left;
	}
	public void setRight(BT right)
	{
		this.right=right;
	}
	public BT getRight()
	{
		return this.right;
	}
	
	
	public void zigZag(BT root)
	{
		LinkedList<BT> right=new LinkedList<BT>();
		LinkedList<BT> left=new LinkedList<BT>();
		int leftToRight=1;
		if(root==null)
			return;
		left.addFirst(root);
		while(!right.isEmpty()|| !left.isEmpty())
		{
			if(leftToRight==1)
			{
				BT cu=left.removeLast();
				if(cu.getLeft()!=null)
					left.addFirst(cu.getLeft());
				if(cu.getRight()!=null)
					right.addFirst(cu.getRight());
				System.out.println(cu.getData());
				leftToRight=0;
			}
			else
			{
				BT cu=right.removeLast();
				if(cu.getLeft()!=null)
					left.addFirst(cu.getLeft());
				if(cu.getRight()!=null)
					right.addFirst(cu.getRight());
				System.out.println(cu.getData());
				leftToRight=1;
			}
		}
	}
	
	public void verticalSum(BT root)
	{
		LinkedList<BT> ll=new LinkedList<BT>();
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		int column=0;
		if(root==null)
			return;
		ll.addFirst(root);
		hs.put(column, root.getData());
		while(!ll.isEmpty())
		{
			if(root.getLeft()!=null)
			{
				ll.addFirst(root.getLeft());
				if(hs.containsKey(column-1))
				{
					int val=hs.get(column-1);
					val=val+root.getLeft().getData();
					hs.replace(column-1, val);
				}
				else
				{
					hs.put(column-1,root.getLeft().getData());
				}
				
			}
			if(root.getRight()!=null)
			{
				ll.addFirst(root.getRight());
				if(hs.containsKey(column+1))
				{
					int val=hs.get(column+1);
					val=val+root.getRight().getData();
					hs.replace(column+1, val);
				}
				else
				{
					hs.put(column+1,root.getRight().getData());
				}
			}
			root=ll.removeLast();
		}
	}
	
	public void verticalSum(BT root,int column,final TreeMap<Integer,Integer> hs)
	{
		
		if(root==null)
			return;
		if(hs.containsKey(column))
		{
			int val=hs.get(column);
			val=val+root.getData();
			hs.put(column, val);
		}
		else
		{
			hs.put(column,root.getData());
		}
		verticalSum(root.getLeft(),column-1,hs);
		verticalSum(root.getRight(),column+1,hs);
	}
	
	public static void main(String[] args) {
		
	BT b4=new BT(4,null,null);
	BT b5=new BT(5,null,null);
	BT b6=new BT(6,null,null);
	BT b7=new BT(7,null,null);
	BT b2=new BT(2,b4,b5);
	BT b3=new BT(3,b6,b7);
	BT b1=new BT(1,b2,b3);
	//driver
	BT zig=new BT();
	//zig.zigZag(b1);
	TreeMap<Integer,Integer> hs=new TreeMap<Integer,Integer>();
	BT vs1=new BT();
	vs1.verticalSum(b1,0,hs);
	Iterator it=hs.entrySet().iterator();
	while(it.hasNext())
	{
		Map.Entry<Integer, Integer> en=(Map.Entry<Integer, Integer>) it.next();
		System.out.println(en.getKey()+"---"+en.getValue());
	}
	
	}
}