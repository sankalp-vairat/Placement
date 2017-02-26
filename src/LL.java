import java.util.LinkedList;

public class LL {

	public static void main(String[] args) {
		
		LinkedList<Integer> li=new LinkedList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		System.out.println(li.removeLast());
		li.addFirst(5);
		int i=0;
		while(i<li.size())
		{
			System.out.println(li.get(i));
			i++;
			
		}
		
	}
}
