import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start {


    public static void main(String[] args) {
        Fraction fraction = new Fraction(1,2);
      TMemory<Fraction> f = new TMemory<Fraction>(fraction);
        try {
            f.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}