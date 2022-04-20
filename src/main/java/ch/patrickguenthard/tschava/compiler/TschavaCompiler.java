package ch.patrickguenthard.tschava.compiler;

import ch.patrickguenthard.tschava.data.Data;

import java.util.Map;
import java.io.*;


/**
 * Created by patrick on 19.04.17.
 */
public class TschavaCompiler {
    private boolean ignoreUmlautMode = false;

    public void compile(BufferedReader reader, BufferedWriter writer) throws IOException {
	String line;
	while ((line = reader.readLine()) != null) {
	    if (line.indexOf(Data.PRAGMA) >= 0) {
		parsePragma(line);
	    }
	    for(Map.Entry<String,String> d : Data.getKeywords().entrySet()) {
		line = line.replaceAll(d.getKey(), d.getValue());
	    }
	    if (!ignoreUmlautMode) {
		for(Map.Entry<String,String> d : Data.getUmlauts().entrySet()) {
		    line = line.replaceAll(d.getKey(), d.getValue());
		}
	    }
	    writer.write(line + "\n");
	}
	writer.close();
    }

    private void parsePragma(String line) {
	if (line.indexOf("umluut") >= 0) {
	    if (line.indexOf("umluut ab") >= 0) {
		this.ignoreUmlautMode = false;
	    } else if (line.indexOf("umluut a") >= 0) {
		this.ignoreUmlautMode = true;
	    }
	}
    }
}
