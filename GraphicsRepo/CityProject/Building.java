
/**
 * Write a description of class city here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
public class Building
{

	private int base, height;
	private Color color;
    public Building(int width, int length, Color shade){
		 base = width;
		 height = length;
		 color = shade;
	}

	public void draw(Graphics page){
		int square = 20;
		page.setColor(color);
		//	page.fillRect(20, 20, base, height);
		int move = 0;
		for(int i = 0, j = 0; i < base; i+=20, j+=1, move += 20){
			page.fillRect(i , 0, 10, 10);
			if (j % 2 != 0)
				page.setColor(Color.white);
			else
				page.setColor(color);

		}

	}
	}


