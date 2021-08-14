import java.util.*;

class TestReplace_19BAI10021 
{
	public int[] replace(int[] arr, int index)
	{
		int max = arr[0];
		for(int i = 1; i< arr.length; i++)
		{
			if(max<arr[i])
				max = arr[i];
		}

		arr[index] = max;

		return arr;
	}

	public float[] replace(float[] arr, int index)
	{
		float max = arr[0];
		for(int i = 1; i< arr.length; i++)
		{
			if(max<arr[i])
				max = arr[i];
		}

		arr[index] = max;

		return arr;
	}

	public String replace(String s, int index)
	{
		String[] sub = s.split(" ", 0);

		String str = s.substring(0,index) + sub.length + s.substring(index+1);
	
		return str;
	}

	public static void main(String[] args) 
	{
		TestReplace_19BAI10021 obj = new TestReplace_19BAI10021();
		int[] list1 = new int[]{1, 9, 3, 5, 6, 8};
		float[] list2 = new float[]{1, 9, 3, 4, 6, 15};
		String s = "Hello Dude, how are you doing?";

		System.out.println("INPUT - ");
		System.out.println(Arrays.toString(list1) + " and Index given - 2");
		System.out.println(Arrays.toString(list2) + " and Index given - 4");
		System.out.println(s + " and Index given - 7");

		int[] new_list1 = obj.replace(list1, 2);
		float[] new_list2 = obj.replace(list2, 4);
		String new_s = obj.replace(s, 7);

		System.out.println("\nOUTPUT - ");
		System.out.println(Arrays.toString(new_list1));
		System.out.println(Arrays.toString(new_list2));
		System.out.println(new_s);
		
	}
}