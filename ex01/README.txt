# ImagesToChar - BMP to ASCII Converter (JAR Distribution)

## Compilation (from project root):
javac -d target src/java/fr/school42/printer/app/Program.java src/java/fr/school42/printer/logic/Logic.java

## JAR Creation:
cp -r src/resources target/
jar cfm target/images-to-chars-printer.jar src/manifest.txt -C target .

## Execution:
java -jar target/images-to-chars-printer.jar <white-char> <black-char>

## Example:
java -jar target/images-to-chars-printer.jar . 0

## Using Makefile:
make jar
make run WHITE=. BLACK=0
make clean

## Usage:
The program converts a BMP image (embedded in JAR) to ASCII art using specified characters for white and black pixels.
