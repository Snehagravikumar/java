class Tv
{

boolean display=true;
Speaker speaker;

Tv(Speaker speaker)
{
	this.speaker=speaker;
	
}

void displayTv()
{
		System.out.println("Start Displaytv");

	System.out.println("Tv Display :"+this.display);
	System.out.println("Tv Speaker :"+this.speaker);
	if(this.speaker!=null)
	{
			System.out.println("Speaker MaxVolume :"+this.speaker.maxVolume);

	}
	System.out.println("End DispalyTv");

}
}

