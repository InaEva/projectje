package matcher.mk.i;

import java.util.regex.Pattern;

import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class RunMatchSequence {
	
	public static void main(String[] args) {
		try {
			
		
		
		String emailRegEx = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*";
		//	String emailRegEx = "(?s).*";
		Pattern pattern = Pattern.compile(emailRegEx);

		 
		 
		 String target= "You can email me at g_andy@example.com or andy@example.net to get more info";
		 String target2="You can email";
		java.util.regex.Matcher matcher; {

		 matcher = pattern.matcher(target);
		 
		 while(matcher.find()) {
			 System.out.println("Found a Match: " + matcher.group());
		
		      }}} catch (StackOverflowError e) {
		    	  System.out.println("Stackoverflow");
					//JOptionPane.showMessageDialog(null, "Stackoverflow");
				}
	}
	
}
