package matcher.mk.i;

import java.util.regex.Pattern;

public class RunMatchSequence {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emailRegEx = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*";

		Pattern pattern = Pattern.compile(emailRegEx);

		 
		 
		 String targetString = "You can email me at g_andy@example.com or andy@example.net to get more info";

		java.util.regex.Matcher matcher; {

		 matcher = pattern.matcher(targetString);
		 
		 while(matcher.find()) {
			 System.out.println("Found a Match" + Matcher.group());
			 System.out.println("Start position: " + Matcher.start()); 
		     System.out.println("End position: " + Matcher.end()); 
		      }}
	}
	
}
