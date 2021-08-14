import java.util.*;
class TreeSetDemo_19BAI10021 
{
	public static void main(String args[]) 
	{
		// Create a tree set.
		TreeSet<String> ts = new TreeSet<String>();
		// Add elements to the tree set.
		//ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		System.out.println("Here's the TreeSet: \n");

		Iterator itr = ts.iterator();

		while(itr.hasNext())
		{
			Object temp = itr.next();
			System.out.print("\t" + temp);
		}

	}
}