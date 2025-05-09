class Customer{
	private String name;
	private String address;
	private String email;
	private long contact;
	private long adhar;
	private String pan;
	private double bal;
	private int pin;
	private static String ifscCode;
	private long accountNum;

	Customer(){
		super();
	}
	Customer(String name,String address, String email , long contact, long adhar, String pan , double bal, int pin)
	{
         this.name =name;
         this.address =address;
         this.email = email;
         this.contact =contact;
         this.adhar= adhar;
         this.pan =pan;
         this.bal =bal;
         this.pin =pin;
         this.accountNum =(long)(Math.random()*100000000000l);
	}

	public String getName(){
		return this.name;
	}
	public String setName(String newName){
		this.name =newName;
	}
	public String getAddress(){
		return this.address;
	}
	public void setAddress(String newAddress){
		this.address = newAddress;
	}
	public String getEmail(){
		return this.email;
	}
	public void setAddress(String newEmail){
		this.email = newEmail;
	}
	public long getContact(){
		return this.contact;
	}
	public void setContact(long newContact){
		this.contact =newContact;
	}
	public long getAdhar(){
		return adhar;
	}
	public int getPan(){
		return this.pan;
	}
	public double getBalance(){
		return bal;
	}
	public void setBalance(double newBal){
		this.bal = newBal;
	}
	public int getPin(){
		return this.pin;
	}
	public void setPin(int newPin){
		this.pin=newPin;
	}
	public long getAccountNumber(){
		return this.accountNum;
	}
	public String getIfscCode(){
		return this.ifscCode;
	}

}