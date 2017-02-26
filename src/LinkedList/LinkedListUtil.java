package LinkedList;
import java.util.HashSet;

import javax.management.modelmbean.DescriptorSupport;
public class LinkedListUtil {

	
	public static void display(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println("");
	}
	
	public static int size(Node head)
	{
		int count=0;
		while(head!=null)
		{
			head=head.next;
			count++;
		}
		return count;
	}
	
	public static Node push(Node head,Node newHead)
	{
		if(newHead==null)
			return head;
		if(head==null)
			return newHead;
		newHead.next=head;
		return newHead;
	}
	
	public static Node push(Node head,int data)
	{
		Node newHead=new Node();
		newHead.data=data;
		newHead.next=head;
		return newHead;
	}
	
	public static Node addLast(Node head,int data)
	{
		if(head==null)
		{
			head =new Node();
			head.data=data;
			head.next=null;
			return head;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=new Node();
		temp.next.data=data;
		temp.next.next=null;
		return head;
	}
	
	public static Node reverse(Node head)
	{
		if(head==null)
			return head;
		Node previous=null;
		Node currentHead;
		while(head!=null)
		{
			currentHead=head;
			head=head.next;
			currentHead.next=previous;
			previous=currentHead;
		}
		return previous;
	}
	
	public static Node sortedMerge(Node head_1,Node head_2)
	{
		if(head_1==null && head_2==null)
			return null;
		if(head_1==null && head_2!=null)
			return head_1;
		if(head_2==null && head_1!=null)
			return head_2;
		Node new_head=null;
		if(head_1.data<=head_2.data)
		{
			new_head=head_1;
			head_1=head_1.next;
		}
		else if(head_1.data>head_2.data)
		{
			new_head=head_2;
			head_2=head_2.next;
		}
		Node temp=new_head;
		while(head_1!=null && head_2!=null)
		{
			if(head_1.data<head_2.data)
			{
				temp.next=head_1;
				temp=head_1;
				head_1=head_1.next;
			}
			else if(head_1.data>head_2.data)
			{
				temp.next=head_2;
				temp=head_2;
				head_2=head_2.next;
			}
		}
		if(head_1==null)
		{
			while(head_2!=null)
			{
				temp.next=head_2;
				temp=head_2;
				head_2=head_2.next;
			}
		}
		if(head_2==null)
		{
			while(head_1!=null)
			{
				temp.next=head_1;
				temp=head_1;
				head_1=head_1.next;
			}
		}
		return new_head;
	}
	
	public static Node sortedMergeRec(Node head_1,Node head_2)
	{
		Node result=null;
		if(head_1==null)
			return head_2;
		if(head_2==null)
			return head_1;
		
		if(head_1.data<=head_2.data)
		{
			result=head_1;
			result.next=sortedMergeRec(head_1.next,head_2);
		}
		else if(head_1.data>head_2.data)
		{
			result=head_2;
			result.next=sortedMergeRec(head_1,head_2.next);
		}
		
		return result;
	}
	
	public static Node union(Node head_1,Node head_2)
	{
		if(head_1==null && head_2==null)
			return null;
		if(head_1==null && head_2!=null)
			return head_2;
		if(head_1!=null && head_2==null)
			return head_1;
		HashSet<Integer> hs=new HashSet<Integer>();
		Node newHead=head_1;
		Node temp=null;
		while(head_1!=null)
		{
			hs.add(head_1.data);
			temp=head_1;
			head_1=head_1.next;
		}
		
		while(head_2!=null)
		{
			if(!hs.contains(head_2.data))
			{
				temp.next=head_2;
				temp=head_2;
				head_2=head_2.next;
			}
			else {
				head_2=head_2.next;
			}
		}
		return newHead;
	}
	
	public static Node intersection(Node head_1,Node head_2)
	{
		if(head_1==null && head_2==null)
			return null;
		if(head_1==null && head_2!=null)
			return head_2;
		if(head_1!=null && head_2==null)
			return head_1;
		
		HashSet<Integer> hs=new HashSet<Integer>();
		Node newHead=null;
		Node temp=null;
		while(head_1!=null)
		{
			hs.add(head_1.data);
			temp=head_1;
			head_1=head_1.next;
		}
		
		while(head_2!=null)
		{
			if(hs.contains(head_2.data))
			{
				if(newHead==null)
					newHead=head_2;
				temp.next=head_2;
				temp=head_2;
				head_2=head_2.next;
				temp.next=null;
			}
			else {
				head_2=head_2.next;
			}
		}
		return newHead;
	}
	
}
