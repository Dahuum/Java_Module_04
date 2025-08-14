/* 
    fr.42.printer.app.Program
    ↑  ↑  ↑       ↑   ↑
    │  │  │       │   └─ Class name
    │  │  │       └─ Package (what kind of code)
    │  │  └─ Project name  
    │  └─ School identifier
    └─ Country/organization
*/
package fr.school42.printer.app;
import fr.school42.printer.logic.Logic; 

public class Program {

    private static String fileName;
    private static char   whiteChar;
    private static char   blackChar;
    
	public static void main ( String [] args ) {
	    if (args.length == 3) {
			fileName = args[0];
			whiteChar = args[1].charAt(0);
			blackChar = args[2].charAt(0);
		}
		else {
            System.err.println("Usage: java Program <image-path> <white-char> <black-char>");
            System.exit(1);
		}
		Logic btmDeal = new Logic();
		btmDeal.processImage(fileName, whiteChar, blackChar);
	}
    
}