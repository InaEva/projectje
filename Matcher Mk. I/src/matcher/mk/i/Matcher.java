/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matcher.mk.i;

import java.util.regex.Pattern;
/**
 *
 * @author Ikkileo
 */
public class Matcher{
	 public static void main(String[] args) {
	      
	    
	


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
 
//implements MatchResult {
  //  Pattern p = Pattern.compile("a*b");
 //   java.util.regex.Matcher m = p.matcher("aaaaab");
// boolean b = m.matches();
//}
    

    
}

private static String group() {
	// TODO Auto-generated method stub
	return group();
}

private static String end() {
	// TODO Auto-generated method stub
	return end();
}

private static String start() {
	// TODO Auto-generated method stub
	return start();
}

}
// testetsteststetststestests hoi 1337
// (>O.O)> l33t x infity
// rainbow bunchie
// test