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
    
	public static void main ( String [] args ) {
	    if (args.length != 2) {
            System.err.println("Usage: java -jar app.jar <white-char> <black-char>");
            System.exit(1);
		}
		char whiteChar = args[0].charAt(0);
		char blackChar = args[1].charAt(0);

		Logic btmDeal = new Logic();
		btmDeal.processImage(whiteChar, blackChar);
	}
    
}
