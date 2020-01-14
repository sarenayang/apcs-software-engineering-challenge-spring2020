
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

	private int base, height, xpoint, ypoint;
	private Color color;
	private Random generator = new Random();

    public Building(int x, int y, int width, int length, Color shade){
		 base = width;
		 height = length;
		 color = shade;
		 xpoint = x;
		 ypoint = y;
	}

	public void draw(Graphics page){
		page.setColor(color);
		page.fillRect(xpoint, ypoint, base, height);
		}

	}



