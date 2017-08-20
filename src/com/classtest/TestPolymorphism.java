package com.classtest;

class RBI{  
	float getRateOfInterest()
	{
		return 0;
	}  
}

class SBI extends RBI{  
	float getRateOfInterest()
	{
		return 8.4f;
	}  
}

class ICICI extends RBI{  
	float getRateOfInterest()
	{
		return 7.3f;
	}  
}

class AXIS extends RBI{  
	float getRateOfInterest()
	{
		return 9.7f;
	}  
}

class TestPolymorphism{  
	public static void main(String args[]){  
		RBI rbi = new RBI();
		System.out.println("RBI rate of Interest: " +rbi.getRateOfInterest());
		
		SBI sbi = new SBI();  
		System.out.println("SBI Rate of Interest: "+sbi.getRateOfInterest()); 
		
		rbi=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+rbi.getRateOfInterest());  
		
		rbi=new AXIS();  
		System.out.println("AXIS Rate of Interest: "+rbi.getRateOfInterest());  
	}  
}  