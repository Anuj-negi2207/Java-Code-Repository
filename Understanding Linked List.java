import java.util.*;

class LinkedListDemo_19BAI10021
{
	public static void main(String args[]) 
	{
		// Create a linked list.
		LinkedList<String> ll = new LinkedList<String>();
		// Add elements to the linked list.
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A2");
		System.out.println("Elements of Linked List are: \n");

		for(String temp: ll)
		{
			System.out.print("\t" + temp);
		}
		
	}
}