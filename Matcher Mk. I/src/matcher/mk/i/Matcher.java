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

String emailRegEx = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*";

Pattern pattern = Pattern.compile(emailRegEx);

 
 
 String targetString = "You can email me at g_andy@example.com or andy@example.net to get more info";

private java.util.regex.Matcher matcher; {

 matcher = pattern.matcher(targetString);
 
 while(matcher.find()) {
	 System.out.println("Found a Match" + Matcher.group());
	 System.out.println("Start position: " + Matcher.start()); 
     System.out.println("End position: " + Matcher.end()); 
 }
 
//implements MatchResult {
  //  Pattern p = Pattern.compile("a*b");
 //   java.util.regex.Matcher m = p.matcher("aaaaab");
// boolean b = m.matches();
//}
    
public static int start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int start(int group) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public static int end() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int end(int group) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String group() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public String group (int group) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int groupCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

}
// testetsteststetststestests hoi 1337
// (>O.O)> l33t x infity
// rainbow bunchie
// test