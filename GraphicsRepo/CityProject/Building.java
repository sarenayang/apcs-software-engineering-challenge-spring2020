
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
	public void setNewColor(int x, int y, int z){
		color = new Color(x, y, z);
	}
	public void setX(int x){
		if (x<-base)
			xpoint = 1000;

		else
			xpoint = x;
	}
	public void setBase(int y){
		base = y;
	}

	public void draw(Graphics page){
		page.setColor(Color.black);
		page.drawRect(xpoint-1, ypoint-1, base+1, height+1);
		page.setColor(color);
		page.fillRect(xpoint, ypoint, base, height);

		//rows of windows
		for (int xInc = WINDOW_PADDING; xInc < base - WINDOW_SIZE; xInc += WINDOW_SIZE + WINDOW_PADDING){

			//columns of windows
			for (int yInc = WINDOW_PADDING; yInc < height-WINDOW_SIZE; yInc += WINDOW_SIZE + WINDOW_PADDING) {

				//turns windows on and off
				if (generator.nextInt(100) < 15)
					page.setColor(Color.yellow);
				else
					page.setColor(Color.black);

				page.fillRect(xpoint+xInc, ypoint+yInc, WINDOW_SIZE, WINDOW_SIZE);
			}
		}
	}
}


