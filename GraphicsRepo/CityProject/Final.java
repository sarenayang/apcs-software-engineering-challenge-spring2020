import java.util.Random;
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;



public class Final extends JApplet{
	private Random gen = new Random();

	private StoreBuild building;
	private Sky sky;
	public static final int APPLET_WIDTH = 1042;
	public static final int APPLET_HEIGHT = 500;
	private Graphics jav;
	public void init(){

		building = new StoreBuild();
		sky = new Sky();
		setSize (APPLET_WIDTH, APPLET_HEIGHT);
		//setBackground(Color.cyan);

	}
	public void paint(Graphics page){
			sky.draw(page);
			//focuses on making and moving only the buildings
			building.draw(page);

			try{
				//pause the program for a quarter second (millisecond)
				Thread.sleep(50);
			}
			catch(InterruptedException e) {}



		repaint();

	}


}