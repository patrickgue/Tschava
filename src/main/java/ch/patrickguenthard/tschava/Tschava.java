package ch.patrickguenthard.tschava;

import ch.patrickguenthard.tschava.compiler.TschavaCompiler;

import java.io.*;

/**
 * Created by patrick on 19.04.17.
 */
public class Tschava {



    public static void main(String[] args) {
	TschavaCompiler compiler;

        if(args.length < 2) {
            System.out.println("Gopfridschtutz! Nöd gnueg parameter!\nEs brucht e tschava datei als igab und e java datei als usgab als parameter!");
        }
        else {
	    compiler = new TschavaCompiler();
	    String inputFile = args[0];
            String outputFile = args[1];
            try {
                BufferedReader reader = new BufferedReader(new FileReader(new File(inputFile)));
                BufferedWriter writer = new BufferedWriter(new FileWriter(new File(outputFile)));
		compiler.compile(reader, writer);
            } catch (IOException e) {
                System.err.println("S het ned funktioniert...");
                e.printStackTrace();
            }
        }
    }
}
