class KeyChainTrainee
{
public static void main(String[] args)
{
	System.out.println("Start main in KeyChainTrainee");
	
	KeyChain keychain=new KeyChain();
	System.out.println("KeyChain design :"+keychain.design);
	System.out.println("KeyChain cost :"+keychain.cost);
	System.out.println("KeyChain noOfKeys :"+keychain.noOfKeys);
	System.out.println("KeyChain type :"+keychain.type);
	System.out.println("KeyChain usedTo :"+keychain.usedTo);

	System.out.println("######################################");
	
	KeyChain keychain1=new KeyChain("Guiter",150,3);
	System.out.println("KeyChain design :"+keychain1.design);
	System.out.println("KeyChain cost :"+keychain1.cost);
	System.out.println("KeyChain noOfKeys :"+keychain1.noOfKeys);
	System.out.println("KeyChain type :"+keychain1.type);
	System.out.println("KeyChain usedTo :"+keychain1.usedTo);
	
	System.out.println("######################################");
	
	KeyChain keychain2=new KeyChain("Heart",200,6,"Glass");
	System.out.println("KeyChain design :"+keychain2.design);
	System.out.println("KeyChain cost :"+keychain2.cost);
	System.out.println("KeyChain noOfKeys :"+keychain2.noOfKeys);
	System.out.println("KeyChain type :"+keychain2.type);
	System.out.println("KeyChain usedTo :"+keychain2.usedTo);
	
	System.out.println("######################################");
	
	KeyChain keychain3=new KeyChain("Doll",100,2,"Cloth");
	System.out.println("KeyChain design :"+keychain3.design);
	System.out.println("KeyChain cost :"+keychain3.cost);
	System.out.println("KeyChain noOfKeys :"+keychain3.noOfKeys);
	System.out.println("KeyChain type :"+keychain3.type);
	System.out.println("KeyChain usedTo :"+keychain3.usedTo);
	
	System.out.println("######################################");

	KeyChain keychain4=new KeyChain("God",50,5,"wooden","to hang keys");
	System.out.println("KeyChain design :"+keychain4.design);
	System.out.println("KeyChain cost :"+keychain4.cost);
	System.out.println("KeyChain noOfKeys :"+keychain4.noOfKeys);
	System.out.println("KeyChain type :"+keychain4.type);
	System.out.println("KeyChain usedTo :"+keychain4.usedTo);
	

	
	System.out.println("End main in KeyChainTrainee");

}

}