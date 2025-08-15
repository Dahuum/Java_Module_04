# ImagesToChar - Colored BMP to ASCII Converter with External Libraries

## External Libraries Required:
- jcommander-1.82.jar: Professional command-line argument parsing
- JCDP-4.0.2.jar: Colored console output

## Compilation (from project root):
javac -cp "jcommander-1.82.jar:JCDP-4.0.2.jar" -d target src/java/fr/school42/printer/app/Program.java src/java/fr/school42/printer/logic/Logic.java

## JAR Creation with External Libraries:
cp -r src/resources target/
cd target && jar xf ../jcommander-1.82.jar && jar xf ../JCDP-4.0.2.jar
jar cfm target/images-to-chars-printer.jar src/manifest.txt -C target .

## Execution:
java -jar target/images-to-chars-printer.jar --white <COLOR> --black <COLOR>

## Available Colors:
RED, GREEN, BLUE, YELLOW, MAGENTA, CYAN, WHITE, BLACK

## Examples:
java -jar target/images-to-chars-printer.jar --white RED --black GREEN
java -jar target/images-to-chars-printer.jar --white BLUE --black YELLOW

## Using Makefile:
make compile
make jar  
make run WHITE=RED BLACK=GREEN
make test
make clean

## Usage:
The program converts a BMP image (embedded in JAR) to colored ASCII art using external libraries for command-line parsing and colored terminal output.
