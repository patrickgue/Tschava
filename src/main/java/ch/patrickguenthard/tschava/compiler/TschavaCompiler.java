package ch.patrickguenthard.tschava.compiler;

import ch.patrickguenthard.tschava.data.Data;

import java.util.Map;

/**
 * Created by patrick on 19.04.17.
 */
public class TschavaCompiler {
    public static String compile(String inputText) {
        for(Map.Entry<String,String> d : Data.getKeywords().entrySet()) {
            inputText = inputText.replaceAll(d.getKey(), d.getValue());
        }
        for(Map.Entry<String,String> d : Data.getUmlauts().entrySet()) {
            inputText = inputText.replaceAll(d.getKey(), d.getValue());
        }
        return inputText;
    }

}
