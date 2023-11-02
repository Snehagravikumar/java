class KeyChain
{
  String design;
  double cost;
  int noOfKeys;
  String type;
  String usedTo;
  
  KeyChain()
  {
	  this("God",50,5,"wooden","to hang keys");
  }
  KeyChain(String design,double cost,int noOfKeys)
  {
	this.design=design;
    this.cost=cost;
    this.noOfKeys=noOfKeys;	
	 System.out.println("KeyChain with design,cost and noOfKeys :"+design+","+cost+","+noOfKeys); 
  }
  KeyChain(String design,double cost,int noOfKeys,String type)
  {
	  this(design,cost,noOfKeys);
	  this.type=type;
	  System.out.println("KeyChain with design,cost,noOfKeys and type :"+design+","+cost+","+noOfKeys+","+type); 

  }
  KeyChain(String design,double cost,int noOfKeys,String type,String usedTo)
  {
	  this(design,cost,noOfKeys,type);
	  this.usedTo=usedTo;
 System.out.println("KeyChain with design,cost,noOfKeys,type and usedTo :"+design+","+cost+","+noOfKeys+","+type+","+usedTo); 

  }
}