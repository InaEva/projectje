/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matcher.mk.i;

import java.util.regex.MatchResult;
import java.util.regex.Pattern;

/**
 *
 * @author Ikkileo
 */
public class Matcher extends Object
implements MatchResult {
    Pattern p = Pattern.compile("a*b");
    java.util.regex.Matcher m = p.matcher("aaaaab");
 boolean b = m.matches();

    @Override
    public int start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int start(int group) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int end() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int end(int group) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String group() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String group(int group) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int groupCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
// testetsteststetststestests hoi 1337

