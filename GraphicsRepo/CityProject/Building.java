
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
	//keeps window size and space in between the same
	private final int WINDOW_SIZE = 10;
	private final int WINDOW_PADDING = 10;

	//variables that will be called eventually
	private int base, height, xpoint, ypoint;
	private Color color;

	//used to animate the windows based on probability
	private Random generator = new Random();

    public Building(int x, int y, int xWindows, int yWindows, Color shade){

		// since building is based on how many windows wanted vertically and horizontally
		//the length and height of the building must be calculated using those values
		 base = WINDOW_PADDING + xWindows * (WINDOW_SIZE + WINDOW_PADDING); //base and height are in pixels
		 height = WINDOW_PADDING + yWindows * (WINDOW_SIZE + WINDOW_PADDING);

		 color = shade;
		 xpoint = x;
		 //moves the starting point from upper left to lower left corner
		 ypoint = y-height;
	}

	//returns x value of building
	public int getXPoint(){
		return xpoint;
	}

	//creates a random color for the building, different colored buildings
	//everytime the program is ran
	public void setNewColor(int x, int y, int z){
		color = new Color(x, y, z);
	}

	//sets a new x value for the building
	public void setX(int x){

		//once the building is offscreen, it resets to appear on the right
		if (x<-base)
			xpoint = 1042;

		else
			xpoint = x;
	}

	//sets a new value for the base length (not actually used)
	public void setBase(int y){
		base = y;
	}

	public void draw(Graphics page){

		//draws the actual building
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

				//draws the window
				page.fillRect(xpoint+xInc, ypoint+yInc, WINDOW_SIZE, WINDOW_SIZE);
			}
		}
	}
}


