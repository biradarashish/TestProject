package com.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		//String mydata = "Test Phase Lur - 06/07/2017 Standard Visit AU0007864";
		String mydata = "test phase - 06/07/2017 Action plan : 07/06/2017 AU0007864";
		String auRegex = "([AU]+)(\\d{7})";
		String locationRegex = "(([a-zA-Z\\s]*)[\\s][-]([\\d\\W\\d]*))";
		String visitRegex = "(([a-zA-Z\\s]*)[\\s][:]([\\d\\W\\d]*))";
		
		String locationName = null;
		String auCode = null;
		String visitType = null;
		
		Pattern pattern = Pattern.compile(locationRegex);
		Matcher matcher = pattern.matcher(mydata);
		if (matcher.find())
		{
			locationName = matcher.group(0).trim();
		    System.out.println("Location: " +locationName);
		}
		
		if(mydata.contains("Action")){
			Pattern p = Pattern.compile(visitRegex);
			Matcher m = p.matcher(mydata);
			if(m.find()){
				visitType = m.group(0).trim();
				System.out.println("Visit Type: " +visitType);
			}
		}else{
			int len = locationName.length();
			
			visitType = mydata.substring(len, len+15);
			System.out.println("Visit type: " +visitType.trim());
		}
			
		Pattern pn = Pattern.compile(auRegex);
		Matcher mr = pn.matcher(mydata);
		if (mr.find())
		{
			auCode = mr.group(0);
		    System.out.println("AU: " +auCode);
		}
		
	}
}
