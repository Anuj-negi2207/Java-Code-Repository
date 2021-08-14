import java.util.*;

class ArrayDequeDemo_19BAI10021
{
	public static void main(String args[]) 
	{
		// Create an array deque.
		ArrayDeque<String> adq = new ArrayDeque<String>();
		// Use an ArrayDeque like a stack.
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		
		System.out.println("\nSo, here's our ArrayDeque : " + adq);

		//peekFirst
		System.out.println("\nNow, we'll see peekFirst");
		String temp = adq.peekFirst();
		System.out.println("So, peekFirst should return head of the deque: " + temp);

		//peekLast
		System.out.println("\nNow, we'll see peekLast");
		temp = adq.peekLast();
		System.out.println("So, peekLast should return tail of the deque: " + temp);
		
		//pollFirst
		System.out.println("\nNow, we'll see pollFirst");
		temp = adq.pollFirst();
		System.out.println("So, pollFirst should return head of the deque: " + temp + " and Remove this object from deque");
		
		//pollLast
		System.out.println("\nNow, we'll see pollLast");
		temp = adq.pollLast();
		System.out.println("So, pollLast should return tail of the deque: " + temp + " and Remove this object from deque");
		
		System.out.println("\nSo, here's our Updated ArrayDeque : " + adq);

		//removeFirst
		System.out.println("\nNow, we'll see removeFirst");
		temp = adq.removeFirst();
		System.out.println("So, removeFirst should return head of the deque: " + temp + " and Remove this object from deque");
	
		//removeLast
		System.out.println("\nNow, we'll see removeLast");
		temp = adq.removeLast();
		System.out.println("So, removeLast should return tail of the deque: " + temp + " and Remove this object from deque");
	
		System.out.println("\nSo, here's our Updated ArrayDeque : " + adq);
	}
}