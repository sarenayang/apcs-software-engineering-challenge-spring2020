
/**
 * Write a description of class city here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.Random;
public class Building
{
	private final int WINDOW_SIZE = 20;
	private final int WINDOW_PADDING =5;

	private int base, height, xpoint, ypoint;
	private Color color;
	private Random generator = new Random();

    public Building(int x, int y, int xWindows, int yWindows, Color shade){
		 base = WINDOW_PADDING+xWindows*(WINDOW_SIZE+WINDOW_PADDING); //base and height are in pixels
		 height = WINDOW_PADDING+yWindows*(WINDOW_SIZE+WINDOW_PADDING);
		 color = shade;
		 xpoint = x;
		 ypoint = y-height;
	}

	public void draw(Graphics page){
		int interval = 10;

		page.setColor(color);
		page.fillRect(xpoint, ypoint, base, height);

		for (int xOff=WINDOW_PADDING; xOff<base-WINDOW_SIZE; xOff+=WINDOW_SIZE+WINDOW_PADDING) {
			for (int yOff=WINDOW_PADDING; yOff<height-WINDOW_SIZE; yOff+=WINDOW_SIZE+WINDOW_PADDING) {
				if (generator.nextInt(100) < 9)
					page.setColor(Color.yellow);
				else
					page.setColor(Color.black);

				page.fillRect(xpoint+xOff, ypoint+yOff, WINDOW_SIZE, WINDOW_SIZE);
			}
		}
	}
}


