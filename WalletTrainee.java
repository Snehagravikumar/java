class WalletTrainee 
{
public static void main(String[] args)
{
	System.out.println("Start main in WalletTrainee");
	
	Wallet wallet=new Wallet();
	System.out.println("Wallet Brand :"+wallet.brand);
	System.out.println("Wallet Cost :"+wallet.cost);
	System.out.println("Wallet Color :"+wallet.color);
	System.out.println("Wallet No Of Pocket :"+wallet.noOfPocket);

	
	Wallet wallet1=new Wallet("WildHorn");
	System.out.println("Wallet Brand :"+wallet1.brand);
	System.out.println("Wallet Cost :"+wallet1.cost);
	System.out.println("Wallet Color :"+wallet1.color);
	System.out.println("Wallet No Of Pocket :"+wallet1.noOfPocket);
	
	
	Wallet wallet2=new Wallet("Bellory",800);
	System.out.println("Wallet Brand :"+wallet2.brand);
	System.out.println("Wallet Cost :"+wallet2.cost);
	System.out.println("Wallet Color :"+wallet2.color);
	System.out.println("Wallet No Of Pocket :"+wallet2.noOfPocket);
	
	
	Wallet wallet3=new Wallet("WildHorn",750,"black");
	System.out.println("Wallet Brand :"+wallet3.brand);
	System.out.println("Wallet Cost :"+wallet3.cost);
	System.out.println("Wallet Color :"+wallet3.color);
	System.out.println("Wallet No Of Pocket :"+wallet3.noOfPocket);
	
	
	Wallet wallet4=new Wallet("WildHorn",750,"black",5);
	System.out.println("Wallet Brand :"+wallet4.brand);
	System.out.println("Wallet Cost :"+wallet4.cost);
	System.out.println("Wallet Color :"+wallet4.color);
	System.out.println("Wallet No Of Pocket :"+wallet4.noOfPocket);
	
	System.out.println("End main in WalletTrainee");

}

}