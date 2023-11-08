class ATMTrainee
{
	public static void main(String[] args)
	{
		System.out.println("Start main in ATMTrainee");
		
		String[] arrayBranchs=new String[5];
		
		arrayBranchs[0]="Kundur";
		arrayBranchs[1]="Davanagere";
		arrayBranchs[2]="Shimoga";
		arrayBranchs[3]="Banglore";
		arrayBranchs[4]="Haveri";
		
		String[] arrayAcs=new String[3];
          
		  arrayAcs[0]="Voltas";
		  arrayAcs[1]="Blue Star";
		  arrayAcs[2]="Haier";
          
		String[] arrayCCtvs=new String[5];
		
		arrayCCtvs[0]="IDIS";
		arrayCCtvs[1]="HoneyWell";
		arrayCCtvs[2]="Axis";
		arrayCCtvs[3]="Hikvision";
		arrayCCtvs[4]="Dahua";
		
		String ref="Karnataka";
		ATM atm=new ATM(arrayBranchs);
		atm.bankName=ref;
		atm.setBrands(arrayAcs,arrayCCtvs);
		atm.displayATM();
		
		System.out.println("End main in ATMTrainee");

	}
}