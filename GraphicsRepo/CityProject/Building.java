
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
	private final int WINDOW_SIZE = 10;
	private final int WINDOW_PADDING = 10;

	private int base, height, xpoint, ypoint;
	private Color color;
	private Random generator = new Random();

    public Building(int x, int y, int xWindows, int yWindows, Color shade){
		 base = WINDOW_PADDING + xWindows * (WINDOW_SIZE + WINDOW_PADDING); //base and height are in pixels
		 height = WINDOW_PADDING + yWindows * (WINDOW_SIZE + WINDOW_PADDING);

		 color = shade;
		 xpoint = x;
		 //moves the starting point from upper left to lower left corner
		 ypoint = y-height;
	}

	public int getXPoint(){
		return xpoint;
	}
	public int getYPoint(){
		return ypoint;
	}
	public void setX(int x){
		xpoint = x;
	}
	public void setBase(int y){
		base = y;
	}

	public void draw(Graphics page){
		page.setColor(Color.black);
		page.drawRect(xpoint-1, ypoint-1, base, height);
		page.setColor(color);
		page.fillRect(xpoint, ypoint, base, height);

		//rows of windows
		for (int xOff = WINDOW_PADDING; xOff < base - WINDOW_SIZE; xOff += WINDOW_SIZE + WINDOW_PADDING){
			//columns of windows
			for (int yOff = WINDOW_PADDING; yOff < height-WINDOW_SIZE; yOff += WINDOW_SIZE + WINDOW_PADDING) {

				//turns windows on and off
				if (generator.nextInt(100) < 9)
					page.setColor(Color.yellow);
				else
					page.setColor(Color.black);

				page.fillRect(xpoint+xOff, ypoint+yOff, WINDOW_SIZE, WINDOW_SIZE);
			}
		}
	}
}


