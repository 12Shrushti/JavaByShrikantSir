class GoogleDriver{
	public static void main(String[] args) 
	{
		Bank bank = new Bank("SBI", "Suresh", "SBIN0001234", 1234);
        GooglePay gpay = new GooglePay("Ramesh", "kumar", "Ramesh@gmail.com", "123 pune", 
            9876543210L, "12/01", "password123", "Male", 
            "ramesh GPay", 9876543210L, 123456789, bank);
       System.out.println("-------------------------------------");
       gpay.getGoogleDetails();
       gpay.getGooglePayDetails();


         GoogleClassroom classroom = new GoogleClassroom("Ganesh", "kumar", "ganesh@gmail.com", "Pune, karve",
                9876501234L, "28/10/2000", "Ganesh123", "male",
                "Java M29", "java123", "Java Programming", 50, "Shrikant sir", "https://meet.link/java");
         System.out.println("-------------------------------------");
         classroom.getGoogleDetails();

        classroom.getGoogleClassRoomDetails();

        
        GoogleMap map = new GoogleMap("Mukesh", "kumar", "mukesh@gmail.com", "Karvenagar, pune",
                9876509876L, "12/02/2003", "mukesh123", "Male",
                "Pune", "Mumbai", "Restaurants, Petrol Pumps", "Pune Home", "Lonavala");
        System.out.println("-------------------------------------");

       map.getGoogleDetails();
        map.getGoogleMapDetails();
	}
}
class Google{
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private long contact;
	private String dob;
	private String password;
	private String gender;

	public Google(){
		super();
	}

	public Google(String firstName, String lastName, String email, 
		String address, long contact,String dob,String password ,String gender)
	{   
		super();
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.address=address;
		this.contact=contact;
		this.dob=dob;
		this.password=password;
		this.gender=gender;
	}


	public void getGoogleDetails(){
		System.out.println("Google:   [firstName= "+firstName+ ", Last Name= "+lastName+
			", Email = "+email+ ", Address= "+address+"Contact= "+contact+
			", DOB= "+dob+ ", Password= "
			+password+ ", Gender=  "+gender);
	}

}

// class Bank{
// 	private String name;
// 	private String accountHolderName;
// 	private String ifscCode;
// 	private int pin;

	
	
// 	public void addBankAccount(){
// 		Bank bank = new Bank();

// 	}
// }

class Bank {
    private String name;
    private String accountHolderName;
    private String ifscCode;
    private int pin;

    public Bank() {
    	super();
    }

    public Bank(String name, String accountHolderName, String ifscCode, int pin) {
        this.name = name;
        this.accountHolderName = accountHolderName;
        this.ifscCode = ifscCode;
        this.pin = pin;
    }

 
    public void addBankAccount() {
        System.out.println( "[Bank Name=" + name + ", Account Holder=" + accountHolderName +
                ", IFSC=" + ifscCode + ", PIN=" + pin + "]");
    }
}

class GooglePay extends Google{
	private String gname;
	private long gContactNum;
	private int upiId;
	Bank bank;
	public GooglePay(){
		super();
	}
	public GooglePay(String firstName, String lastName, String email, 
		String address, long contact,String dob,String password ,String gender , //google formal argu

		String gname ,long gContactNum,int upiId ,Bank bank //googlePay foramal argu
	)
	{
		super(firstName, lastName,email,address,contact,dob,password,gender);
		this.gname=gname;
		this.gContactNum=gContactNum;
		this.upiId=upiId;
		this.bank=bank;

	}



	public void getGooglePayDetails(){
		System.out.println("GooglePay:     [ Gname= "+gname+", GcontactNum= "+gContactNum+
			", UPI ID= "+upiId+ ", Bank= "+bank);
	}
}

class GoogleClassroom extends Google{
	private String cname;
	private String code;
	private String subject;
	private int count;
	private String trainer;
	private String link;

	public GoogleClassroom(){
		super();
	}

	public GoogleClassroom(String firstName, String lastName, String email, 
		String address, long contact,String dob,String password ,String gender //google formal argu

		,String cname , String code, String subject,int count, String trainer ,String link  //GoogleClassroom formal argu
	){
		super(firstName, lastName, email, address, contact, dob, password, gender);
		this.cname =cname;
		this.code=code;
		this.subject=subject;
		this.count=count;
		this.trainer=trainer;
		this.link=link;

	}
	public void getGoogleClassRoomDetails() {
		System.out.println("Google Classroom: [Class Name=" + cname + ", Code=" + code +
			", Subject=" + subject + ", Count=" + count + ", Trainer=" + trainer + ", Link=" + link + "]");
	}
}
class GoogleMap extends Google{
	private String currentLoc ;
	private String destination;
	private String validPlaces;
	private String homeLocation;
	private String savedLoc;
	public GoogleMap(){
		super();
	}
	 public GoogleMap(String firstName, String lastName, String email, String address,
        long contact, String dob, String password, String gender,
        String currentLoc, String destination, String validPlaces, String homeLocation, String savedLoc) {
        super(firstName, lastName, email, address, contact, dob, password, gender);
        this.currentLoc = currentLoc;
        this.destination = destination;
        this.validPlaces = validPlaces;
        this.homeLocation = homeLocation;
        this.savedLoc = savedLoc;
    }
    public void getGoogleMapDetails() {
        System.out.println("Google Map [Current Location=" + currentLoc + ", Destination=" + destination +
            ", Valid Places=" + validPlaces + ", Home=" + homeLocation + ", Saved=" + savedLoc + "]");
    }
}