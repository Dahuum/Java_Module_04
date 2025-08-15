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
import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

public class Program {
    
    @Parameter(names = "--white", description = "White pixel color")
    private String whiteColor = "WHITE";
    
    @Parameter(names = "--black", description = "Black pixel color")
    private String blackColor = "BLACK";

    
	public static void main ( String [] args ) {
        Program program = new Program();
	    try {
            System.out.println("Arguments received:");
            for (int i = 0; i < args.length; i++)  System.out.println("  [" + i + "]: '" + args[i] + "'");

    		
   	        JCommander.newBuilder().addObject(program).build().parse(args);
            
    		Logic processor = new Logic();
    		processor.processImage(program.whiteColor, program.blackColor);
					
		} catch (Exception e) { System.err.println("Error in main: " + e.getMessage()); }
	}
    
}
