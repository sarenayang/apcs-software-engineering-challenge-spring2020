import java.util.Random;
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;



public class Final extends Applet{
	private Random gen = new Random();

	private StoreBuild building;
	private final int APPLET_WIDTH = 1042;
	private final int APPLET_HEIGHT = 500;

	public void init(){

		//when moving buildings over, do #of windows of previous building * 20 + 10 to be next to each other
		//(start x, start y, num of windows across, number of windows down, color)


		building = new StoreBuild();
		setSize (APPLET_WIDTH, APPLET_HEIGHT);
		setBackground(Color.cyan);

	}
	public void paint(Graphics page){

			//focuses on making and moving only the buildings
			building.draw(page);

			page.setColor(Color.black);
			page.fillRect(0, 300, 1042, 50);

			try{
				//pause the program for a quarter second (millisecond)
				Thread.sleep(100);
			}
			catch(InterruptedException e) {}



		repaint();

	}


}