
package fr.school42.printer.logic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;


public class Logic {
	
	public void processImage(char whiteChar, char blackChar) {
	    try {
			InputStream stream = getClass().getResourceAsStream("/resources/image.bmp");
			BufferedImage image = ImageIO.read(stream);
			
			for (int y = 0; y < image.getHeight(); y++) {
			    for (int x = 0; x < image.getWidth(); x++) {
					int pixel = image.getRGB(x, y);
					
					if (pixel == -16777216) System.out.print(blackChar);
					else System.out.print(whiteChar);
				}
    			System.out.println();
			}
		} catch (Exception e) { System.err.println("Error reading image: " + e.getMessage()); }
	}
    
}

