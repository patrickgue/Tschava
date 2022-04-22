#!/bin/sh

./target/tschava src/main/tschava/ch/patrickguenthard/tschava/Tschava.tschava
mv src/main/tschava/ch/patrickguenthard/tschava/Tschava.java src/main/java/ch/patrickguenthard/tschava/Tschava.java

./target/tschava src/main/tschava/ch/patrickguenthard/tschava/data/Data.tschava
mv src/main/tschava/ch/patrickguenthard/tschava/data/Data.java src/main/java/ch/patrickguenthard/tschava/data/Data.java

./target/tschava src/main/tschava/ch/patrickguenthard/tschava/compiler/TschavaCompiler.tschava 
mv src/main/tschava/ch/patrickguenthard/tschava/compiler/TschavaCompiler.java src/main/java/ch/patrickguenthard/tschava/compiler/TschavaCompiler.java 
