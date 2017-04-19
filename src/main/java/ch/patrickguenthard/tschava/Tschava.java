package ch.patrickguenthard.tschava;

import ch.patrickguenthard.tschava.compiler.TschavaCompiler;

import java.io.*;

/**
 * Created by patrick on 19.04.17.
 */
public class Tschava {

    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Gopfridschtutz! Nöd gnueg parameter!\nEs brucht e tschava datei als igab und e java datei als usgab als parameter!");
        }
        else {
            String inputFile = args[0];
            String outputFile = args[1];
            String buffer;
            String fileContent = "";
            try {
                BufferedReader reader = new BufferedReader(new FileReader(new File(inputFile)));
                while ((buffer = reader.readLine()) != null) {
                    fileContent += buffer + "\n";
                }
                //System.out.println(fileContent);
                //System.out.println(TschavaCompiler.compile(fileContent));
                BufferedWriter writer = new BufferedWriter(new FileWriter(new File(outputFile)));
                writer.write(TschavaCompiler.compile(fileContent));
                writer.close();
            } catch (IOException e) {
                System.err.println("S het ned funktioniert...");
                e.printStackTrace();
            }
        }
    }
}
