# ImagesToChar - BMP to ASCII Converter

## Compilation (from project root):
javac -d target src/java/fr/school42/printer/app/Program.java src/java/fr/school42/printer/logic/Logic.java

## Execution:
java -cp target fr.school42.printer.app.Program <image-path> <white-char> <black-char>

## Example:
java -cp target fr.school42.printer.app.Program it.bmp . 0

## Alternative using Makefile:
make compile
make run IMAGE=it.bmp WHITE=. BLACK=0
make clean

## Usage:
The program converts BMP images to ASCII art using specified characters for white and black pixels.
