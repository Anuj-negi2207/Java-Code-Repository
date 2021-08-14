import java.util.*;

interface Vehicle
{
	double s = 0;		//static in nature
	String vtype = "HatchBack";	//static in nature

	void speed();	//abstract in nature
}

class Car implements Vehicle
{
	String cname;
	double milage, price;
	Engine e;

	Car()
	{
		cname = new String();
		e = new Engine();
		milage = price = 0;
	}

	Car(String cname, double price, double milage)
	{
		this.cname = cname;
		this.price = price;
		this.milage = milage;
		e = new Engine();
	}

	public void speed()
	{
		System.out.println("Speed = " + this.s);
		System.out.println("Vehicle Type = " + this.vtype);
	}

	public void getCarSpecs() 
	{
		System.out.println("Here are your Car Specs: \n");
		System.out.println("cname = " + cname);
		System.out.println("milage = " + milage + "km/L");
		System.out.println("price = " + price + " rupees");

		getEngineSpecs();
	}
}

class Engine extends Car
{
	String etype;
	double weight;

	Engine(String etype, double weight)
	{
		this.etype = etype;
		this.weight = weight;
	}

	void getEngineSpecs()
	{
		System.out.println("Engine = " + etype + ", Weight = " + weight);
	}
}

class MainClass
{
	public static void main(String[] args) 
	{
		Car c = new Car();
		Car d = new Car("FX600", 952000, 12);

		c.getCarSpecs();
		d.getEngineSpecs();	
	}
}