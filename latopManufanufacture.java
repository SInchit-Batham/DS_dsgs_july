public class latopManufanufacture{
	public static void main(String args[])
	{
		Laptop l=new Laptop(Dell, 1TB, intel, YES);
	}
	
}




public class Laptop {
	
	private String ram;
	private String hdd;
	private String cpu;
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;
	
	public Laptop(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}
	
	System.out.println("size of ram is :" +ram);
	System.out.println("size of HDD is :" + hdd);
	System.out.println("Type of CPU is :" + cpu;
	System.out.println("IsGraphicsEnabled  :" + isGraphicsEnabled);
	System.out.println("IsBluetoothEnabled  :" + isBluetoothEnabled);

	
       
	}
	
	
 
     
    	 
    	 
    
     
}