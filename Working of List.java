import java.util.*;


class Gen<T>
{
	ArrayList<T> L = new ArrayList<T>();

	//For Question 1
	public void insertAtFirst(T ob)
	{
		L.add(0, ob);
		System.out.println(ob + " added to first position of the list.");
	}

	//For Question 2
	public T retrieveFromIndex(int index)
	{
		return L.get(index);
	}

	//For Question 3
	public void update(T ob, int index)
	{
		L.set(index, ob);
		System.out.println("\n\nUpdated at index " + index + " with new value = " + ob);
	}

	//For Question 4
	public void removeTheThird()
	{
		T temp = L.remove(2);
		System.out.println("\n\nElement at Third position = " + temp + ", is removed!");
	}

	//For Question 5
	public void searchThisValue(T ob)
	{
		int index = 0;
		boolean flag = false;
		String s = String.valueOf(ob);

		for(T temp: L)
		{
			String t = String.valueOf(temp);
			if(s.equalsIgnoreCase(t) == true)
				System.out.println("\nObject is found at index = " + index);
				flag = true;
				
			index++;
		}

		if(flag == false)
		{
			System.out.println("\nObject Not Found!");
		}
	}


	//For Question 6
	public void copyTheArray(Gen<T> ob)
	{
		int index = this.L.size();
	
		if(index == 0)
			System.out.println("\n\nThis Array was Empty, so we'll add all the values!");

		else
			System.out.println("\n\nThis Array was not Empty, so we'll append all the values!");

		for(T temp: ob.L)
			this.L.add(index++, temp);
	}


	//to view all the values inside the array
	public void viewTheArray()
	{
		System.out.println("\nData in this Array");
		for(T ob: L)
			System.out.print("\t" + ob);
	}

}

class Assignment5_19BAI10021
{
	public static void main(String[] args) 
	{
		Gen<Integer> list1 = new Gen<Integer>();

		//For Question 1, Adding 3 values at First index
		list1.insertAtFirst(4);
		list1.insertAtFirst(3);
		list1.insertAtFirst(2);
		list1.insertAtFirst(1);
		
		System.out.println("\nChecking the Array - " + list1.L);
		//For Question 2, retrieving element at index 1
		int temp = list1.retrieveFromIndex(1);
		System.out.println("\n\nElement at index 1 is = " + temp);

		//For Question 3, Updating element at index 2 with another value
		list1.update(4, 2);

		//For Question 4, Removing the third value, i.e. at index 2
		list1.removeTheThird();

		//For Question 5, Searching for '4' in 
		list1.searchThisValue(4);


		//For Question 6, Copying the array
		Gen<Integer> list2 =  new Gen<Integer>();
		Gen<Integer> list3 =  new Gen<Integer>();
		

		//Inserting using insertAtFirst only
		list3.insertAtFirst(-1);
		list3.insertAtFirst(-2);
		list3.insertAtFirst(-4);

		list2.copyTheArray(list1); //For part b, list2 is empty
		list3.copyTheArray(list2); //For part a, list3 is not empty

		System.out.println("\n\nLet's view all the arrays - \n");
		list1.viewTheArray();
		list2.viewTheArray();
		list3.viewTheArray();

	}
}