package ch.patrickguenthard.tschava.data;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by patrick on 19.04.17.
 */
public class Data {
    private static Map<String, String> keywords;
    private static Map<String, String> umlauts;

    public static void initKeywords() {
        keywords = new HashMap<>();
        //Control Structure
        keywords.put(" oder\\?", ";");
        keywords.put("päckli", "package");
        keywords.put("öffentliche", "public");
        keywords.put("öffentlichi", "public");
        keywords.put("private", "private");
        keywords.put("privati", "private");
        keywords.put("gschützti", "protected");
        keywords.put("gschützte", "protected");
        keywords.put("wenn", "if");
        keywords.put("susch", "else");
        keywords.put("läri", "void");
        keywords.put("klass", "class");
        keywords.put("schnittstell", "interface");
        keywords.put("nüt", "null");
        keywords.put("min", "this");
        keywords.put("mini", "this");
        keywords.put("zruggeh", "return");

        //System methods
        keywords.put("säg", "System.out.println");
        keywords.put("fluech", "System.err.println");

        //Types
        keywords.put("Tegscht", "java.lang.String");
        keywords.put("Nummere", "java.lang.Integer");
        keywords.put("nummere", "int");
        keywords.put("Langi Nummere", "java.lang.Long");
        keywords.put("langi nummere", "long");
        keywords.put("Komma Zahl", "java.lang.Double");
        keywords.put("komma Zahl", "double");




    }


    private static void initUmlauts() {
        umlauts = new HashMap<>();
        umlauts.put("ä","ae");
        umlauts.put("Å","Ae");
        umlauts.put("ö","oe");
        umlauts.put("Ö","Oe");
        umlauts.put("ü","ue");
        umlauts.put("Ü","Ue");
    }

    public static Map<String, String> getKeywords() {
        if(keywords == null) initKeywords();
        return keywords;
    }

    public static Map<String, String> getUmlauts() {
        if(umlauts == null) initUmlauts();
        return umlauts;
    }
}
