import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.io.Console;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start {


    public static void main(String[] args) {
//       EditorComplex edC = new EditorComplex();
//        System.out.println(edC.getString());
//        System.out.println(edC.characterSlaughter());
//        System.out.println(edC.characterSlaughter());
//        System.out.println(edC.characterSlaughter());
//        System.out.println(edC.addNumeral(5));
//        System.out.println(edC.addDot());
//        System.out.println(edC.addNumeral(2));
//        System.out.println(edC.addSign());
//        System.out.println(edC.addSignChoice("+"));
//        System.out.println(edC.addNumeral(3));
//        System.out.println(edC.addDot());
//        System.out.println(edC.addNumeral(5));

//        EditorPNumber pNum= new EditorPNumber();
//        System.out.println(pNum.getString());
//        System.out.println(pNum.characterSlaughter());
//        System.out.println(pNum.characterSlaughter());
//        System.out.println(pNum.addNumeral(2));
//        System.out.println(pNum.addDot());
//        System.out.println(pNum.addNumeral(3));
//        System.out.println(pNum.addDot());
//        System.out.println(pNum.addNumeral(5));

//        EditorFraction edF = new EditorFraction();
//        System.out.println(edF.getString());
//        System.out.println(edF.characterSlaughter());
//        System.out.println(edF.characterSlaughter());
//        System.out.println(edF.addNumeral(5));
//        System.out.println(edF.addSeparator());
//        System.out.println(edF.addNumeral(3));




//poly

        ArrayList<TMember> members1 = new ArrayList<>();
        members1.add(new TMember(3, 2));
        members1.add(new TMember(6, 4));
        ArrayList<TMember> members2 = new ArrayList<>();
        members2.add(new TMember(3, 2));
        members2.add(new TMember(6, 4));
        TPoly pol1 = new TPoly(members1);
        TPoly pol2 = new TPoly(members2);

        System.out.println(pol1.add(pol2).getPolinom());









        // System.out.println(edC.);




    }


}