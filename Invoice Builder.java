import java.util.*;

class Invoice
{
	String partNumber;
	String description;
	int quantity;
	double pricePerItem;
	Scanner sc = new Scanner(System.in);

	Invoice()
	{
		this.partNumber = new String();
		this.description = new String();
		this.quantity = 0;
		this.pricePerItem = 0.0;
	}

	//SET VALUES
	public void setValuePartNumber()
	{
		System.out.print("Enter Part Number - \t");
		this.partNumber = sc.nextLine();
	}

	public void setValueDescription()
	{
		System.out.print("Enter Part Description- ");
		this.description = sc.nextLine();
	}

	public void setValueQuantity()
	{
		System.out.print("Enter Part quantity - \t");
		this.quantity = sc.nextInt();
	}

	public void setValuePrice()
	{
		System.out.print("Enter Price per item - \t");
		this.pricePerItem = sc.nextDouble();
	}

	public void setValue()
	{
		System.out.println("\nEnter the following details");
		setValuePartNumber();
		setValueDescription();
		setValueQuantity();
		setValuePrice();
	}

	//GET VALUES
	public void getValuePartNumber()
	{
		System.out.println("Part Number - \t\t" + partNumber);		
	}

	public void getValueDescription()
	{
		System.out.println("Part Description - \t" + description);
	}

	public void getValueQuantity()
	{
		System.out.println("Part quantity - \t" + quantity);
	}

	public void getValuePrice()
	{
		System.out.println("Price per item - \t" + pricePerItem);
	}

	public void getValue()
	{
		System.out.println("\nDetails of the product:");
		getValuePartNumber();
		getValueDescription();
		getValueQuantity();
		getValuePrice();
	}

	//GET INVOICE AMOUNT
	public double getInvoiceAmount()
	{
		if(quantity<0)
			quantity = 0;
			
	
		if(pricePerItem<0)
			pricePerItem = 0.00;

		return quantity*pricePerItem;
	}
}

class InvoiceTest_19BAI10021
{
	public static void main(String[] args) 
	{

		Invoice I1 = new Invoice();
		System.out.print("\n\nFor object 1: ");
		I1.setValue();

		System.out.print("\n\nFor object 1: ");
		I1.getValue();

		System.out.println("Total payable: " + I1.getInvoiceAmount());
	}
}