class Technologies
{

String name;
int durationMonth;
String location;
long cost;
double ratings;
String language;
long pinCode;
String trainerName;
int typesOfTechnologies;
double Strength;
int mockTestInMonth;
double highPackage;


Technologies(String name,int durationMonth,String location,long cost,double ratings,String language,
long pinCode,String trainerName,int typesOfTechnologies,double strength,int mockTestInMonth,double highPackage)
{
this.name=name;
this.durationMonth=durationMonth;
this.location=location;
this.cost=cost;
this.ratings=ratings;
this.language=language;
this.pinCode=pinCode;
this.trainerName=trainerName;
this.typesOfTechnologies=typesOfTechnologies;
this.Strength=Strength;
this.mockTestInMonth=mockTestInMonth;
this.highPackage=highPackage;
}
void displayTechnologies()
{
System.out.println(" name is :"+this.name);
System.out.println("durationmonth name is :"+this.durationMonth);
System.out.println(" location is :"+this.location);
System.out.println(" cost is :"+this.cost);
System.out.println(" ratings is :"+this.ratings);
System.out.println(" language is :"+this.language);
System.out.println(" pincode is :"+this.pinCode);
System.out.println(" trainername is :"+this.trainerName);
System.out.println(" typesoftechnologies is :"+this.typesOfTechnologies);
System.out.println("Strength is :"+this.Strength);
System.out.println("MocktestinMonth  is :"+this.mockTestInMonth);
System.out.println("highpackage is :"+this.highPackage);
}
}
