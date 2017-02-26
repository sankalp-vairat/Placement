package BinaryTree;

public class LinkedList {

	LinkedList next;
	int data;
	LinkedList prev;
	
	public LinkedList(LinkedList next,int data,LinkedList prev) {
		this.next=next;
		this.data=data;
		this.prev=prev;
	}

	public LinkedList getNext() {
		return next;
	}

	public void setNext(LinkedList next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LinkedList getPrev() {
		return prev;
	}

	public void setPrev(LinkedList prev) {
		this.prev = prev;
	}
	
}
