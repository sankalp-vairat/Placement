package LinkedList;

public class EvenOdd {

	public static Node evenOdd(Node head)
	{
		if(head==null)
			return null;
		if(head.next==null)
			return head;
		if(head.next.next==null)
			return head;
		
		Node temp_odd=head;
		Node temp_even1=head.next;
		Node temp_even=head.next;
		while(head.next.next!=null && temp_even.next.next!=null)
		{
			if(head.next.next!=null)
			{
				temp_even=head.next;
				head.next=temp_even.next;
				head=head.next;
			}
			if(temp_even.next.next!=null)
			{
				head.next=temp_even.next;
				temp_even.next=head.next.next;
				temp_even=temp_even.next;
			}
		}
		temp_odd.next=temp_even1;
		return temp_odd;
	}
}
