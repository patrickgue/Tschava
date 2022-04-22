#!/bin/sh

if [ "$#" -lt 1 ]; then
    echo "Usage: tschava file.tschava"
    exit
fi

FILE=$PWD/$1
OUT=`echo $FILE | sed 's/\.tschava//'`.java;

cd "$(dirname "$0")"


echo $FILE
echo $OUT

java -jar tschava-0.0.1.jar $FILE $OUT
