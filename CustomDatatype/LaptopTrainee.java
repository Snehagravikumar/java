class LaptopTrainee
{
	public static void main(String[] args)
	{
		System.out.println("Start main in LaptopTrainee");
		
		String[] arrayCities=new String[6];
		arrayCities[0]="Davanagere";
		arrayCities[1]="Shimoga";
		arrayCities[2]="Bangalore";
		arrayCities[3]="Mysore";
		arrayCities[4]="Hubli";
		arrayCities[5]="Hasan";

		
		Brand brand=new Brand(arrayCities);
		brand.setOriginCEOName("bangalore","Yang Yuanqing");
		
		City city=new City("Davanagere","Karnataka");
	
		Address address=new Address(city);

		Owner owner=new Owner(address);
		owner.setPermanetTemporary("Davanagere","Bangalore");
	
		Hardware hardware=new Hardware(brand);
		hardware.setNameAndType("KeyBoard","Wired");
		
		Hardware hardware1=new Hardware(brand);
		hardware1.setNameAndType("Power unit","Wired");
		
		Hardware hardware2=new Hardware(brand);
		hardware2.setNameAndType("Mouse","Wireless");
		
		Hardware hardware3=new Hardware(brand);
		hardware3.setNameAndType("Storage","Wireless");
		
		Hardware hardware4=new Hardware(brand);
		hardware4.setNameAndType("Graphics","Wireless");
		
		Hardware hardware5=new Hardware(brand);
		hardware5.setNameAndType("SoundCard","Wireless");
		
		Hardware hardware6=new Hardware(brand);
		hardware6.setNameAndType("Ssd","Wired");
		
		Hardware hardware7=new Hardware(brand);
		hardware7.setNameAndType("Cpu","Wired");
		
		Hardware hardware8=new Hardware(brand);
		hardware8.setNameAndType("Ram","Wired");
		
		Hardware hardware9=new Hardware(brand);
		hardware9.setNameAndType("MotherBoard","wired");
		
		Hardware[] arrayHardware={hardware,hardware1,hardware2,hardware3,hardware4,
		hardware5,hardware6,hardware7,hardware8,hardware9};
	
		Laptop laptop=new Laptop(arrayHardware);
		laptop.setOwner(owner);
		laptop.setBrand(brand);
		laptop.displayLaptop();
		
		System.out.println("End main in LaptopTrainee");

	}
}