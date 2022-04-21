package ch.patrickguenthard.tschava.data;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by patrick on 19.04.17.
 */
public class Data {
    public static String PRAGMA = "#hiwis";

    public static String UMLUUT = "umluut";

    public static String PRAGMA_ON = "a";
    public static String PRAGMA_OFF = "ab";
    
    
    private static Map<String, String> keywords;
    private static Map<String, String> umlauts;

    public static void initKeywords() {
        keywords = new HashMap<>();
        //Control Structure
        keywords.put(" oder\\?", ";");
        keywords.put("päckli", "package");
	keywords.put("inezieh", "import");
        keywords.put("öffentliche", "public");
        keywords.put("öffentlichi", "public");
        keywords.put("private", "private");
        keywords.put("privati", "private");
        keywords.put("gschützti", "protected");
	keywords.put("gschützte", "protected");
	keywords.put("statischi", "static");
        keywords.put("statische", "static");
        keywords.put("finale", "final");
        keywords.put("finali", "final");
	keywords.put("wenn", "if");
        keywords.put("susch", "else");
        keywords.put("läri", "void");
        keywords.put("klass", "class");
        keywords.put("schnittstell", "interface");
	keywords.put("macht nah", "implement");
	keywords.put("erwiteret", "extends");
        keywords.put("nüt", "null");
	keywords.put("mini", "this");
	keywords.put("min", "this");
        keywords.put("zruggeh", "return");
	keywords.put("neue", "new");
	keywords.put("neui", "new");
	keywords.put("solang", "while");
	keywords.put("mach", "do");
	keywords.put("für", "for");
	keywords.put("versuech", "try");
	keywords.put("fang", "catch");
	keywords.put("rüert", "throws");
	keywords.put("gang witer", "continue");	

        //System methods
        keywords.put("säg", "System.out.println");
        keywords.put("fluech", "System.err.println");

        //Types
        keywords.put("Tegscht", "java.lang.String");
        keywords.put("Nummere", "java.lang.Integer");
        keywords.put("nummere", "int");
	keywords.put("logisch", "boolean");
        keywords.put("Logisch", "java.lang.Boolean");
	keywords.put("Langi Nummere", "java.lang.Long");
        keywords.put("langi nummere", "long");
        keywords.put("Komma Zahl", "java.lang.Double");
        keywords.put("komma Zahl", "double");
	keywords.put("Lischte", "java.util.List");
	keywords.put("SammligsLischte", "java.util.ArrayList");
	keywords.put("Karte", "java.util.Map");
	keywords.put("HashKarte", "java.util.HashMap");
	keywords.put("PuffereteLeser", "java.io.BufferedReader");
	keywords.put("PuffereteSchriber", "java.io.BufferedWriter");
	keywords.put("DateiLeser", "java.io.FileReader");
	keywords.put("DateiSchriber", "java.io.FileWriter");
	keywords.put("Datei", "java.io.File");
	keywords.put("Usnahm ", "java.lang.Exception ");

        // bruchts immer
        keywords.put("startfunktion", "public static void main(String[] args)");
	keywords.put("\\.zeigUsnahmVerlauf", ".printStackStrace");
	keywords.put("\\.schlüsse", ".close");
	keywords.put("\\.schrib", ".write");
	keywords.put("\\.liesLinie", ".readLine");
	keywords.put("\\.indexVo", ".indexOf");
	keywords.put("\\.ersetzAll", ".replaceAll");
	
	


    }


    private static void initUmlauts() {
        umlauts = new HashMap<>();
        umlauts.put("ä","ae");
        umlauts.put("Ä","Ae");
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
