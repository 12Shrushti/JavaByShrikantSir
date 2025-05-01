class MobileDriver{
	public static void main(String[] args) {
		OperatingSystem os = new OperatingSystem("10.1.2" , "Android " ,12.5, "17 apr 2025");

		Mobile obj = new Mobile("RealMe" ,"C65" ,15000,"Black",12.5 ,os);
		obj.pc.displayProcessor();
		obj.displayMobile();
		obj.os.displayOS();
		obj.battery.displayBattery();
		
	}
}
class Mobile{
	String brand;
	String model;
	double price;
	String color;
	double camera;
	OperatingSystem os;
	Battery battery;
	Processor pc = new Processor("Dual", 3 ,64 );

	Mobile(String brand , String model, double price,String color,double camera ,OperatingSystem os)
	{
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
		this.camera = camera;
		this.os = os;
		this.battery = new Battery(5000, "Lithium", "Primary", "17 Jun 2025", "2 year", 50);
		this.pc = new Processor("Dual", 3.0, 64);
	}
	public void displayMobile(){
		System.out.println("Brand is: "+brand);
		System.out.println("Model is: "+model);
		System.out.println("Price is: "+price);
		System.out.println("Color is: "+color);
		System.out.println("Camera : "+camera);

	}

}
class OperatingSystem{
	String version;
	String name;
	double memory;
	String releaseDate;
	OperatingSystem(String version,String name,double memory,String releaseDate)
	{
		super();
		this.version = version;
		this.name = name;
		this.memory = memory;
		this.releaseDate = releaseDate;

	}
	public void displayOS()
	{
		System.out.println("Version is: "+ version);
		System.out.println("Name : "+ name);
		System.out.println("Memory: "+ memory);
		System.out.println("Release Date: "+ releaseDate);
	}

}
class Battery{
	int capacity;
	String brand;
	String type;
	String mfgDate;
	String waranty;
	double power;
	Battery(int capacity, String brand,String type ,
		String mfgDate,String waranty,double power)
	{
		super();
		this.capacity = capacity;
		this.brand = brand;
		this.type = type;
		this.mfgDate = mfgDate;
		this.waranty = waranty;
		this.power = power;
	}
	public void displayBattery(){
		System.out.println("Capacity is :"+capacity);
		System.out.println("Brand is: "+ brand);
		System.out.println("Type is: "+type);
		System.out.println("Manufatured Date is : "+mfgDate);
		System.out.println("Waranty : "+waranty);
		System.out.println("Power : "+power);

	}
}
class Processor{
	String type;
	double clockSpeed;
	int ram;
	Processor(String type,double clockSpeed,int ram)
	{
		super();
		this.type = type;
		this.clockSpeed = clockSpeed;
		this.ram = ram; 
	}
	public void displayProcessor()
	{
		System.out.println("Type : "+type);
		System.out.println("Clock Speed : "+clockSpeed);
		System.out.println("RAM : "+ram);
	}
}