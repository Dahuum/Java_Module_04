
package fr.school42.printer.logic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;


public class Logic {
    private ColoredPrinter printer = new ColoredPrinter.Builder(1, false).build();
	
	public void processImage(String whiteColor, String blackColor) {
	    try {
			InputStream stream = getClass().getResourceAsStream("/resources/image.bmp");
			BufferedImage image = ImageIO.read(stream);
			
			for (int y = 0; y < image.getHeight(); y++) {
			    for (int x = 0; x < image.getWidth(); x++) {
					int pixel = image.getRGB(x, y);
					/* tests white: ░ | ▓ | ' ' */
					/* tests black: █ | ▓ |  ██ */
					if (pixel == -16777216) printColordChar("█", blackColor);
					else printColordChar("░", whiteColor);
				}
    			System.out.println();
			}
		} catch (Exception e) { System.err.println("Error reading image: " + e.getMessage()); }
	}
	
	private void printColordChar(String character, String colorName) {
	    try {
			Ansi.FColor color = Ansi.FColor.valueOf(colorName.toUpperCase());
			printer.print(character, Ansi.Attribute.NONE, color, Ansi.BColor.NONE);
		} catch (Exception e) { System.err.println("Char: " + character + " Error: " + e.getMessage()); }
	}
    
}

