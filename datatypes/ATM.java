class ATM
{
	String bankName;
	String[] branch;
	String[] acs;
	String[] cctv;
	
	ATM(String[] branch)
	{
		this.branch=branch;
	}
	
	void setBrands(String[] acs,String[] cctv)
	{
		this.acs=acs;
		this.cctv=cctv;
	}
    
	void displayATM()
	{
		System.out.println("Start Display ATM");
		System.out.println("Bank Name :"+bankName);
		System.out.println("Branch :"+branch);
		if(branch!=null)
		{
			for(int b=0;b<branch.length;b++)
			{
				String bname=this.branch[b];
				System.out.println("Branch is "+bname+" in the index "+b);
			}
		}
		System.out.println("Acs Brand :"+acs);
		if(acs!=null)
		{
			for(int ac=0;ac<acs.length;ac++)
			{
				String acBrand=this.acs[ac];
				System.out.println("Branch is "+acBrand+" in the index "+ac);
			}
		}
		
		System.out.println("CCTV Brand :"+cctv);
		if(cctv!=null)
		{
			for(int cam=0;cam<cctv.length;cam++)
			{
				String cctvBrand=this.cctv[cam];
				System.out.println("Branch is "+cctvBrand+" in the index "+cam);
			}
		}
		System.out.println("End Display ATM");

	}
	
}