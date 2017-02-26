package LinkedList;

import java.lang.reflect.Array;
import java.util.ArrayList;

import LinkedList.LinkedListUtil;

public class Driver {

	public static void main(String[] args) {
		Node head_1=LinkedListUtil.addLast(null,1);
		LinkedListUtil.addLast(head_1,2);
		LinkedListUtil.addLast(head_1,3);
		LinkedListUtil.addLast(head_1,4);
		LinkedListUtil.addLast(head_1,5);
		LinkedListUtil.display(head_1);
		//LinkedListUtil.display(LinkedListUtil.reverse(head_1));
		
		Node head_2=LinkedListUtil.addLast(null,2);
		LinkedListUtil.addLast(head_2,5);
		LinkedListUtil.addLast(head_2,7);
		LinkedListUtil.addLast(head_2,6);
		LinkedListUtil.addLast(head_2,11);
		LinkedListUtil.addLast(head_2,12);
		LinkedListUtil.display(head_2);
		
		//Node newHead=LinkedListUtil.sortedMerge(head_1,head_2);
		//Node newHead=LinkedListUtil.union(head_1,head_2);
		//Node newHead=LinkedListUtil.intersection(head_1,head_2);
		
		//LinkedListUtil.display(LinkedListUtil.sortedMergeRec(head_1,head_2));
		LinkedListUtil.display(EvenOdd.evenOdd(head_1));
		
		ArrayList<Integer> a=new ArrayList<>();
		Integer[] arr=(Integer[]) a.toArray();
		
	}	
}
