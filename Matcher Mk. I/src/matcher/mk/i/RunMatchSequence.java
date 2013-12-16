package matcher.mk.i;

import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class RunMatchSequence {
	

	public static void main(String[] args) {
		try {
			
		
		
	//	String emailRegEx = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*";
			String emailRegEx = "(?s).*";
		Pattern pattern = Pattern.compile(emailRegEx);

		 
		 
		 String target= "You can email me at g_andy@example.com or andy@example.net to get more info";
		 String target2="You can email";
		java.util.regex.Matcher matcher; {

		 matcher = pattern.matcher(target);
		 
		 while(matcher.find()) {
			 System.out.println("Found a Match" + Matcher.group());
			 System.out.println("Start position: " + Matcher.start()); 
		     System.out.println("End position: " + Matcher.end()); 
		      }}} catch (StackOverflowError e) {
		    	  System.out.println("Stackoverflow");
					//JOptionPane.showMessageDialog(null, "Stackoverflow");
				}
	}
	
}
